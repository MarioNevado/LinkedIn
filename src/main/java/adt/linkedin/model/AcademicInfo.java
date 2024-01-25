package adt.linkedin.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "academic_info")
public class AcademicInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "current")
    private boolean current;
    @Column(name = "mean_score")
    private double meanScore;
    @Column(name = "init_date")
    private LocalDateTime initDate;
    @Column(name = "end_date")
    private LocalDateTime endDate;
    @Column(name = "title")
    private String title;
    @Column(name = "institution_id")
    private Institution institution;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
