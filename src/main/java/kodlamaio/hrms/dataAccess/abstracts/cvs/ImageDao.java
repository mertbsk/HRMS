package kodlamaio.hrms.dataAccess.abstracts.cvs;

import kodlamaio.hrms.entities.concretes.cvs.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageDao extends JpaRepository<Image, Integer> {

    Image getByCandidate_Id(int id);

}
