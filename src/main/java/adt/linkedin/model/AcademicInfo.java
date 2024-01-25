package adt.linkedin.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Calendar;

@Entity
@Table(name = "academic_info")
public class AcademicInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "current")
    private boolean current;
    @Column(name = "mean_score")
    private float meanScore;
    @Column(name = "init_date")
    private Calendar initDate;
    @Column(name = "end_date")
    private Calendar endDate;
    @Column(name = "title")
    private String title;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "institution_id", nullable = false)
    private Institution institution;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
