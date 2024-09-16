package Service;

import jakarta.persistence.EntityManager;
import models.Bordillo;
import models.Calzada;
import models.DatabaseExecutionContext;
import play.db.jpa.JPAApi;
import repository.BordilloRepository;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.concurrent.CompletableFuture.supplyAsync;
public class BordilloService implements BordilloRepository {
    private final JPAApi jpaApi;
    private final DatabaseExecutionContext executionContext;
    @Inject
    public BordilloService(JPAApi jpaApi, DatabaseExecutionContext executionContext) {
        this.jpaApi = jpaApi;
        this.executionContext = executionContext;
    }
    @Override
    public CompletionStage<Bordillo> add(Bordillo bordillo) {
        return supplyAsync(() -> wrap(em -> insert(em, bordillo)), executionContext);
    }

    @Override
    public CompletionStage<Stream<Bordillo>> list() {
        return supplyAsync(() -> wrap(em -> list(em)), executionContext);
    }

    @Override
    public CompletionStage<Bordillo> update(Bordillo bordillo) {
        return supplyAsync(() -> wrap(em -> updateBordillo(em, bordillo)), executionContext);
    }

    @Override
    public CompletionStage<Bordillo> delete(Long id) {
        return supplyAsync(() -> wrap(em -> deleteBordillo(em, id)), executionContext);
    }

    private <T> T wrap(Function<EntityManager, T> function) {
        return jpaApi.withTransaction(function);
    }

    private Bordillo insert(EntityManager em, Bordillo bordillo) {
        em.persist(bordillo);
        return bordillo;
    }

    private Stream<Bordillo> list(EntityManager em) {
        List<Bordillo> bordillos = em.createQuery("select b from Bordillo b", Bordillo.class).getResultList();
        return bordillos.stream();
    }

    private Bordillo updateBordillo(EntityManager em, Bordillo bordillo) {
        Bordillo bordilloExistente = em.find(Bordillo.class, bordillo.getCodigo());
        if(bordilloExistente != null) {
            bordilloExistente.setLongitud(bordillo.getLongitud());
            bordilloExistente.setCalzada(bordillo.getCalzada());

            return em.merge(bordilloExistente);
        } else {
            return null;
        }
    }

    private Bordillo deleteBordillo(EntityManager em, Long id) {
        Bordillo bordilloExistente = em.find(Bordillo.class ,id);
        if(bordilloExistente != null) {
            em.remove(bordilloExistente);
            return bordilloExistente;
        } else {
            return null;
        }
    }
}
