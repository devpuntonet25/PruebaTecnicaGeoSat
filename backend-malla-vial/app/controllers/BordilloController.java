package controllers;

import Service.BordilloService;
import com.fasterxml.jackson.databind.JsonNode;
import models.Bordillo;
import play.data.FormFactory;
import play.libs.Json;
import play.libs.concurrent.ClassLoaderExecutionContext;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class BordilloController extends Controller {
    private final BordilloService bordilloService;
    private final FormFactory formFactory;
    private final ClassLoaderExecutionContext ec;

    @Inject
    public BordilloController(BordilloService bordilloService, FormFactory formFactory,
                              ClassLoaderExecutionContext ec) {
        this.bordilloService = bordilloService;
        this.formFactory = formFactory;
        this.ec = ec;
    }
    //Este método guarda
    public CompletionStage<Result> addBordillo(final Http.Request request) {
        //Primero validamos si el bordillo se envió mediante un json o mediante un formulario
        if(request.contentType().isPresent() && request.contentType().get().equals("application/json")) {
            //Si se cumple esta condición es porque el bordillo fue enviado mediante un objeto json
            JsonNode json = request.body().asJson();
            if(json == null) {
                return supplyAsync(() -> badRequest("No se puede parsear el objeto JSON"), ec.current());
            }
            //Si el json no es null, entonces podemos convertirlo a la entidad Bordillo
            Bordillo bordillo = Json.fromJson(json, Bordillo.class);

            //Ahora si podemos proceder a guardar el bordillo en la base de datos
            return bordilloService
                    .add(bordillo)
                    .thenApplyAsync(b -> ok(Json.toJson(b)), ec.current());
        } else {//Si no se cumple el primer condicional es porque el bordillo fue enviado mediante un formulario
            //Obtenemos el bordillo del formulario
            Bordillo bordillo = formFactory.form(Bordillo.class).bindFromRequest(request).get();
            //Procedemos a guardar el bordillo
            return bordilloService
                    .add(bordillo)
                    .thenApplyAsync(b -> ok(Json.toJson(b)), ec.current());
        }
    }
    //Este método retorna todos los bordillos
    public CompletionStage<Result> getBordillos() {
        return bordilloService
                .list()
                .thenApplyAsync(bordilloStream -> ok(Json.toJson(bordilloStream.collect(Collectors.toList()))), ec.current());
    }

    //Este método actualiza un bordillo
    public CompletionStage<Result> updateBordillo(final Http.Request request) {
        //Este método es el mismo que el addBordillo, la diferencia es que no guarda, sino que actualiza con el método merge
        //en el BordilloService
        if(request.contentType().isPresent() && request.contentType().get().equals("application/json")) {
            JsonNode json = request.body().asJson();
            if(json == null) {
                return supplyAsync(() -> badRequest("No se pudo parsear el objeto JSON"), ec.current());
            }
            Bordillo bordillo = Json.fromJson(json, Bordillo.class);
            return bordilloService
                    .update(bordillo)
                    .thenApplyAsync(b -> ok(Json.toJson(b)), ec.current());
        } else {
            Bordillo bordillo = formFactory.form(Bordillo.class).bindFromRequest(request).get();
            return bordilloService
                    .update(bordillo)
                    .thenApplyAsync(b -> ok(Json.toJson(b)), ec.current());
        }
    }

    //Este método elimina un bordillo
    public CompletionStage<Result> deleteBordillo(String id) {
        try {
            Long idRecibido = Long.parseLong(id);
            return bordilloService
                    .delete(idRecibido)
                    .thenApplyAsync(b -> ok(Json.toJson(b)), ec.current());
        } catch(NumberFormatException nfe) {
            return CompletableFuture.completedFuture(
                    badRequest("No se puede procesar la petición porque el id " + id + " enviado no es un número")
            );
        } catch(Exception e) {
            return CompletableFuture.completedFuture(
                    internalServerError("Ha ocurrido un error inesperado al eliminar el bordillo")
            );
        }
    }
}
