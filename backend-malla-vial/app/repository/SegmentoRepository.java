package repository;

import Service.SegmentoService;
import com.google.inject.ImplementedBy;
import models.Segmento;

import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

@ImplementedBy(SegmentoService.class)
public interface SegmentoRepository {
    CompletionStage<Segmento> add(Segmento segmento);
    CompletionStage<Stream<Segmento>> list();
    CompletionStage<Segmento> update(Segmento segmento);
    CompletionStage<Boolean> delete(Long id);


}
