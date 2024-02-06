package adt.linkedin.gui;

import adt.linkedin.implementations.UserImplDAO;
import adt.linkedin.model.*;
import adt.linkedin.services.UserService;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        UserImplDAO implDAO = new UserImplDAO();
        UserService service = new UserService();
        User user = implDAO.getUserByName("Mario");
        //Institution institution = new Institution("IES Antares");
        //service.addAcademicInfo(user, new AcademicInfo(true, (float) 9.5, LocalDate.of(2022, 9, 8), "DAM", new Institution("IES Europa")));
        //service.addSkill();
        //?service.addAcademicInfo(user, new AcademicInfo((float) 9.5, LocalDate.of(2019, 9, 8), LocalDate.of(2021, 6, 21), "Bach", institution), institution);
        //service.printUserInfo(user);
        //service.addSkill(user, "Trabajo en equipo");
        service.addCandidature(user, new JobOffer());
    }
}