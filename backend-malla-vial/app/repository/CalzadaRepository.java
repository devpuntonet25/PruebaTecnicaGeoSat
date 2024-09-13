package repository;

import Service.CalzadaService;
import com.google.inject.ImplementedBy;
import models.Calzada;

import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

@ImplementedBy(CalzadaService.class)
public interface CalzadaRepository {
    CompletionStage<Calzada> add(Calzada calzada);
    CompletionStage<Stream<Calzada>> list();
    CompletionStage<Calzada> update(Calzada calzada);
}
