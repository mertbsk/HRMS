package kodlamaio.hrms.entities.concretes.users;

import kodlamaio.hrms.core.entites.User;
import kodlamaio.hrms.entities.concretes.cvDetails.SchoolDetail;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Candidate extends User {

    private String firstName;

    private String lastName;

    private String nationalIdentityNumber;

    private String birthYear;

    //https://www.baeldung.com/jpa-many-to-many#1-modeling-relationship-attributes-1

    @OneToMany(mappedBy = "candidate")
    private Set<SchoolDetail> schoolDetails;

}
