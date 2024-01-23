package adt.linkedin.model;

import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.C;

@Entity
@Table(name = "candidatures")
public class Candidature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "status")
    private String status;
    @Column(name = "cv_path")
    private String cvPath;
    @Column(name = "cover_letter_path")
    private String coverLetterPath;
    @Column(name = "user_id")
    private User user;
}
