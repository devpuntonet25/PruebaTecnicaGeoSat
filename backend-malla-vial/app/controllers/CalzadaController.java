package controllers;

import Service.CalzadaService;
import com.fasterxml.jackson.databind.JsonNode;
import models.Calzada;
import play.data.FormFactory;
import play.libs.Json;
import play.libs.concurrent.ClassLoaderExecutionContext;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class CalzadaController extends Controller {
    private final CalzadaService calzadaService;
    private final FormFactory formFactory;
    private final ClassLoaderExecutionContext ec;

    @Inject
    public CalzadaController(CalzadaService calzadaService, FormFactory formFactory, ClassLoaderExecutionContext ec) {
        this.calzadaService = calzadaService;
        this.formFactory = formFactory;
        this.ec = ec;
    }

    //Método para agregar
    public CompletionStage<Result> addCalzada(final Http.Request request) {
        //Hago esto para poder recibir tanto json como un formulario
        if(request.contentType().isPresent() && request.contentType().get().equals("application/json")) {
            JsonNode json = request.body().asJson();
            if(json == null) {
                return supplyAsync(() -> badRequest("No se pudo parsear el JSON"), ec.current());
            }
            //Si el json no es null, entonces lo parseamos al tipo de la entidad
            Calzada calzada = Json.fromJson(json, Calzada.class);
            return calzadaService
                    .add(calzada)
                    .thenApplyAsync(c -> ok(Json.toJson(c)), ec.current());
        } else { //Este es el caso en el que se hubiera enviado la información mediante un formulario
            Calzada calzada = formFactory.form(Calzada.class).bindFromRequest(request).get();
            return calzadaService
                    .add(calzada)
                    .thenApplyAsync(c -> ok(Json.toJson(c)), ec.current());
        }
    }

    //Método para obtener todos los registros
    public CompletionStage<Result> getCalzadas() {
        return calzadaService
                .list()
                .thenApplyAsync(calzadaStream -> ok(Json.toJson(calzadaStream.collect(Collectors.toList()))), ec.current());
    }
}
