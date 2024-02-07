package monprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import monprojet.entity.Participation;

@Repository
public interface ParticipationRepository extends JpaRepository<Participation, Long> {

    @Query("SELECT SUM(p.pourcentage) FROM Participation p JOIN p.projet pr WHERE pr.fin IS NULL AND :employeId MEMBER OF p.employe")
    Double calculTotalParticipationPourcentage(Integer employeID);

    


    /*@Query("SELECT SUM(p.pourcentage) FROM Participation p JOIN p.projet pr WHERE pr.fin IS NULL AND p.employe.matricule = :employeId")
    Double calculTotalParticipationPourcentage(@Param("employeId") Long employeId);*/


    
    
}
