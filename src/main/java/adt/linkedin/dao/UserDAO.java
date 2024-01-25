package adt.linkedin.dao;

import adt.linkedin.model.*;

import java.util.List;

public interface UserDAO {
    List<AcademicInfo> getUserAcademicInfo(User user);
    void removeUser(User user);
    User getUser(long id);
    List<Skill> getUserSkills(User user);
    List<Candidature> getUserCandidatures(User user);
    List<User> getUsersByName(String name);
    void updateUser(User user);
    void createUser(User user);
    List<WorkExperience> getUserLaboralExperience(User user);
    User getUserByName(String name);

}
