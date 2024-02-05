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
    private long id;
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "institution")
    private List<AcademicInfo> academicInfos = new ArrayList<>();

    public Institution() {
    }
    public Institution(String name) {
        this.name = name;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<AcademicInfo> getAcademicInfos() {
        return academicInfos;
    }
    public void setAcademicInfos(List<AcademicInfo> academicInfos) {
        this.academicInfos = academicInfos;
    }

    @Override
    public String toString() {
        return "Institution{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", academicInfos=" + academicInfos +
                '}';
    }
}

