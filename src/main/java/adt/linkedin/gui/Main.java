package adt.linkedin.gui;

import adt.linkedin.implementations.UserImplDAO;
import adt.linkedin.model.AcademicInfo;
import adt.linkedin.model.Skill;
import adt.linkedin.model.User;
import adt.linkedin.services.UserService;

public class Main {
    public static void main(String[] args) {
        UserImplDAO implDAO = new UserImplDAO();
        UserService service = new UserService();
        User user = new User("Mario", "1234", "m.nevadomerino@gmail.com", 622001844, "");
        service.createUser(user);
        user = implDAO.getUserByName("Mario");
        System.out.println(user);
        //service.addSkill(user, new Skill("skill"));
        service.printUserInfo(user);
    }
}