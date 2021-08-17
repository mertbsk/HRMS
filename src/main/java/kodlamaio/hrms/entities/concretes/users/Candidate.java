package kodlamaio.hrms.entities.concretes.users;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kodlamaio.hrms.core.entites.User;
import kodlamaio.hrms.entities.concretes.cvs.Image;
import kodlamaio.hrms.entities.concretes.cvs.educations.Education;
import kodlamaio.hrms.entities.concretes.cvs.jobExperiences.JobExperience;
import kodlamaio.hrms.entities.concretes.cvs.languages.Language;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private Set<Education> educations;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private Set<JobExperience> jobExperiences;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private Set<Language> languages;

    @JsonIgnore
    @OneToOne(mappedBy = "candidate")
    private Image image;

}
