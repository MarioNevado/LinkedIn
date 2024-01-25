package adt.linkedin.model;

import com.sun.jna.platform.win32.OaIdl;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "institutions")
public class Institution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "institution")
    private List<Institution> institutions = new ArrayList<>();
}

