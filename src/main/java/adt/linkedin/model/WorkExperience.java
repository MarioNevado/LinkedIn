package adt.linkedin.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "laboral_experience")
public class WorkExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "current")
    private boolean current;
    @Column(name = "init_date")
    private LocalDateTime initDate;
    @Column(name = "end_date")
    private LocalDateTime endDate;
    @Column(name = "job_title")
    private String jobTitle;
    @Column(name = "location")
    private String location;
    @Column(name = "company_id")
    private Company company;
    @Column(name = "user_id")
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id", nullable = false)
    private User user;

}