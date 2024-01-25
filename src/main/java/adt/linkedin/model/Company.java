package adt.linkedin.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "company")
    private List<JobOffer> offers;
}

