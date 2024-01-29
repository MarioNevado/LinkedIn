package adt.linkedin.model;

import adt.linkedin.enumerations.Status;
import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "candidatures")
public class Candidature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "status")
    private Status status;
    @Column(name = "cv_path")
    private String cvPath;
    @Column(name = "cover_letter_path")
    private String coverLetterPath;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "users_candidatures", joinColumns = @JoinColumn(name = "candidature_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "candidature")
    private List<JobOffer> offers = new ArrayList<>();


}
