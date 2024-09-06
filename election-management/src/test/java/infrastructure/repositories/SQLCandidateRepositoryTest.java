package infrastructure.repositories;

import domain.CandidateRepository;
import domain.CandidateRepositoryTest;
import jakarta.inject.Inject;

public class SQLCandidateRepositoryTest extends CandidateRepositoryTest {

    @Inject
    SQLCandidateRepository sqlCandidateRepository;

    @Override
    public CandidateRepository repository() {
        return sqlCandidateRepository;
    }
}
