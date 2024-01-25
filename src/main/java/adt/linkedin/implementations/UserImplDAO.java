package adt.linkedin.implementations;

import adt.linkedin.dao.UserDAO;
import adt.linkedin.model.*;

import java.util.List;

public class UserImplDAO implements UserDAO {
    @Override
    public List<AcademicInfo> getUserAcademicInfo(User user) {
        return null;
    }

    @Override
    public void removeUser(User user) {

    }

    @Override
    public User getUser(long id) {
        return null;
    }

    @Override
    public List<Skill> getUserSkills(User user) {
        return null;
    }

    @Override
    public List<Candidature> getUserCandidatures(User user) {
        return null;
    }

    @Override
    public List<User> getUsersByName(String name) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public List<WorkExperience> getUserLaboralExperience(User user) {
        return null;
    }

    @Override
    public User getUserByName(String name) {
        return null;
    }
}
