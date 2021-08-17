package kodlamaio.hrms.dataAccess.abstracts.users;

import kodlamaio.hrms.entities.concretes.cvs.Image;
import kodlamaio.hrms.entities.concretes.users.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateDao extends JpaRepository<Candidate, Integer> {

    boolean existsCandidateByNationalIdentityNumber(String nationalIdentityNumber);

    @Query("update Candidate c set c.image = ?1 where c.id = ?2")
    void updateImageById(int userId, Image image);
}
