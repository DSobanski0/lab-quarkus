package infrastructure.repositories;

import domain.CandidateRepository;
import domain.CandidateRepositoryTest;
import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.BeforeEach;

@QuarkusTest
public class SQLCandidateRepositoryTest extends CandidateRepositoryTest {

    @Inject
    SQLCandidateRepository sqlCandidateRepository;

    @Inject
    EntityManager entityManager;

    @Override
    public CandidateRepository repository() {
        return sqlCandidateRepository;
    }

    @BeforeEach
    @TestTransaction
    void tearDown() {
        entityManager.createNativeQuery("TRUNCATE TABLE candidates").executeUpdate();
    }
}
