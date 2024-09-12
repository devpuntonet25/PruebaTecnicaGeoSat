package Service;


import jakarta.persistence.EntityManager;
import models.DatabaseExecutionContext;
import models.Segmento;
import play.db.jpa.JPAApi;
import repository.SegmentoRepository;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.concurrent.CompletableFuture.supplyAsync;

/**
 * Provide JPA operations running inside of a thread pool sized to the connection pool
 */
public class SegmentoService implements SegmentoRepository {

    private final JPAApi jpaApi;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public SegmentoService (JPAApi jpaApi, DatabaseExecutionContext executionContext) {
        this.jpaApi = jpaApi;
        this.executionContext = executionContext;
    }

    @Override
    public CompletionStage<Segmento> add(Segmento segmento) {
        return supplyAsync(() -> wrap(em -> insert(em, segmento)), executionContext);
    }

    @Override
    public CompletionStage<Stream<Segmento>> list() {
        return supplyAsync(() -> wrap(em -> list(em)), executionContext);
    }

    @Override
    public CompletionStage<Segmento> update(Segmento segmento) {
        return supplyAsync(() -> wrap(em -> updateSegmento(em, segmento)), executionContext);
    }

    @Override
    public CompletionStage<Boolean> delete(Long id) {
        return supplyAsync(() -> wrap(em -> deleteSegmento(em, id)), executionContext);
    }

    private <T> T wrap(Function<EntityManager, T> function) {
        return jpaApi.withTransaction(function);
    }

    private Segmento insert(EntityManager em, Segmento segmento) {
        em.persist(segmento);
        return segmento;
    }

    private Stream<Segmento> list(EntityManager em) {
        List<Segmento> segmentos = em.createQuery("select s from Segmento s", Segmento.class).getResultList();
        return segmentos.stream();
    }

    private Segmento updateSegmento(EntityManager em, Segmento segmento) {
        Segmento segmentoExistente = em.find(Segmento.class, segmento.getNumero());

        if (segmentoExistente != null) {
            segmentoExistente.setNomenclatura(segmento.getNomenclatura());
            segmentoExistente.setLongitud(segmento.getLongitud());

            return em.merge(segmentoExistente);

        } else {
            return null;
        }
    }

    private Boolean deleteSegmento(EntityManager em, Long id) {
        Segmento segmentoExistente = em.find(Segmento.class, id);
        if (segmentoExistente != null) {
            em.remove(segmentoExistente);
            return true;
        } else {
            return false;
        }
    }
}
