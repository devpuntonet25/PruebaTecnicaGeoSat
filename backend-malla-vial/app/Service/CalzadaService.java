package Service;

import jakarta.persistence.EntityManager;
import models.Calzada;
import models.DatabaseExecutionContext;

import play.db.jpa.JPAApi;
import repository.CalzadaRepository;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class CalzadaService implements CalzadaRepository {
    private final JPAApi jpaApi;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public CalzadaService(JPAApi jpaApi, DatabaseExecutionContext executionContext) {
        this.jpaApi = jpaApi;
        this.executionContext = executionContext;
    }

    //Este método llama al que realmente guarda la calzada en la BD
    @Override
    public CompletionStage<Calzada> add(Calzada calzada) {
        return supplyAsync(() -> wrap(em -> insert(em, calzada)), executionContext);
    }

    //Este método llama al que realmente ejecuta el HQL para obtener todas las calzadas
    @Override
    public CompletionStage<Stream<Calzada>> list() {
        return supplyAsync(() -> wrap(em -> list(em)), executionContext);
    }

    private <T> T wrap(Function<EntityManager, T> function) {
        return jpaApi.withTransaction(function);
    }

    private Calzada insert(EntityManager em, Calzada calzada) {
        em.persist(calzada);
        return calzada;
    }

    private Stream<Calzada> list(EntityManager em) {
        List<Calzada> calzadas = em.createQuery("select c from Calzada c", Calzada.class).getResultList();
        return calzadas.stream();
    }

}
