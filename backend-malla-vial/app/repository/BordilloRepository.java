package repository;

import Service.BordilloService;
import com.google.inject.ImplementedBy;
import models.Bordillo;

import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

@ImplementedBy(BordilloService.class)
public interface BordilloRepository {
    CompletionStage<Bordillo> add(Bordillo bordillo);
    CompletionStage<Stream<Bordillo>> list();
    CompletionStage<Bordillo> update(Bordillo bordillo);
    CompletionStage<Bordillo> delete(Long id);
}
