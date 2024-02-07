package monprojet.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import lombok.extern.log4j.Log4j2;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Log4j2 // Génère le 'logger' pour afficher les messages de trace
@DataJpaTest
class ParticipationRepositoryTest {

    @Autowired
    private ParticipationRepository participationRepository;

    @Test
    @Sql({"/test-data.sql"}) // Charge un fichier data.sql personnalisé pour les tests
    void testCalculateTotalParticipationPercentage() {
        log.info("Testing calculTotalParticipationPourcentage method");

        Integer employeId = 1; // ID de l'employé à tester
        Double totalPercentage = participationRepository.calculTotalParticipationPourcentage(employeId);

        assertNotNull(totalPercentage, "Le pourcentage total de participation ne doit pas être null");
        assertEquals(80.0, totalPercentage, "Le pourcentage total de participation doit être égal à 80.0");
    }
}
