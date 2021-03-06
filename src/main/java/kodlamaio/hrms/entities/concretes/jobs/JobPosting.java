package kodlamaio.hrms.entities.concretes.jobs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kodlamaio.hrms.entities.concretes.City;
import kodlamaio.hrms.entities.concretes.users.Employer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "job_postings")

public class JobPosting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_posting_id")
    private int id;

    @NotNull(message = "Açıklama alanı boş bırakılamaz")
    @Size(min = 10, max = 100, message = "Açıklama 100 ile 10 karakter arasında olmalı")
    private String jobDescription;

    private String salaryMin;

    private String salaryMax;

    private String salary;

    @NotNull
    @Min(value = 1, message = "En az 1 adet açık pozisyon bulunmalı")
    private int openPositions;

    @NotNull
    private Date releaseDate;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date applicationDeadline;

    @Column(columnDefinition = "boolean default false")
    private boolean isActive;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Employer employer;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "job_position_id")
    private JobPosition jobPosition;

}
