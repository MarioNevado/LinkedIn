package adt.linkedin.model;

import adt.linkedin.enumerations.WorkDayType;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "job_offer")
public class JobOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "min_salary")
    private int minSalary;
    @Column(name = "max_salary")
    private int maxSalary;
    @Column(name = "open")
    private boolean open;
    @Column(name = "required_candidates")
    private int requiredCandidates;
    @Column(name = "workday_type")
    private WorkDayType workDayType;
    @Column(name = "title")
    private String title;
    @Column(name = "location")
    private String location;
    @Column(name = "details")
    private String details;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "companies_id", nullable = false)
    private Company company;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "offers_skills", joinColumns = @JoinColumn(name = "job_offer_id"), inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private List<Skill> skills = new ArrayList<>();
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "candidature_id", nullable = false)
    private Candidature candidature;

}
