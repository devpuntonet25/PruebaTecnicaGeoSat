package controllers;

import Service.SegmentoService;
import com.fasterxml.jackson.databind.JsonNode;

import models.Segmento;
import play.libs.Json;
import play.mvc.Controller;
import play.data.FormFactory;
import play.libs.concurrent.ClassLoaderExecutionContext;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class SegmentoController extends Controller {
    private final SegmentoService segmentoService;
    private final FormFactory formFactory;
    private final ClassLoaderExecutionContext ec;

    @Inject
    public SegmentoController(SegmentoService segmentoService, FormFactory formFactory, ClassLoaderExecutionContext ec) {
        this.segmentoService = segmentoService;
        this.formFactory = formFactory;
        this.ec = ec;
    }

    public CompletionStage<Result> addSegmento(final Http.Request request) {
        //Primero miramos si el request se hizo enviando un json o enviando un formulario
        if(request.contentType().isPresent() && request.contentType().get().equals("application/json")) {
           JsonNode json = request.body().asJson();
           //Miremos si el json si contiene algo
            if(json == null) {
                return supplyAsync(() -> badRequest("No se pudo parsear el JSON"), ec.current());
            }
            //Parseamos del json a la entidad
            Segmento segmento = Json.fromJson(json, Segmento.class);

            //Retornamos la entidad luego de guardarla
            return segmentoService
                    .add(segmento)
                    .thenApplyAsync(s -> ok(Json.toJson(s)), ec.current());
        } else { //Esta condición aplica cuando se mandó fue un formulario
            Segmento segmento = formFactory.form(Segmento.class).bindFromRequest(request).get();
            return segmentoService
                    .add(segmento)
                    .thenApplyAsync(s -> ok(Json.toJson(s)), ec.current());
        }
    }

    public CompletionStage<Result> getSegmentos() {
        //Este método obtiene todos los segmentos como un stream, los parsea a una lista y luego a un JSON para poder retornarlo
        return segmentoService
                .list()
                .thenApplyAsync(segmentoStream -> ok(Json.toJson(segmentoStream.collect(Collectors.toList()))), ec.current());
    }

    public CompletionStage<Result> updateSegmento(final Http.Request request) {
        if(request.contentType().isPresent() && request.contentType().get().equals("application/json")) {
            JsonNode json = request.body().asJson();
            if(json == null) {
                return supplyAsync(() -> badRequest("No se pudo parsear el objeto JSON"), ec.current());
            }
            Segmento segmento = Json.fromJson(json, Segmento.class);
            return segmentoService
                    .update(segmento)
                    .thenApplyAsync(s -> ok(Json.toJson(s)), ec.current());
        } else {
            Segmento segmento = formFactory.form(Segmento.class).bindFromRequest(request).get();
            return segmentoService
                    .update(segmento)
                    .thenApplyAsync(s -> ok(Json.toJson(s)), ec.current());
        }
    }

}
