package adt.linkedin.gui;

import adt.linkedin.implementations.CompanyImplDAO;
import adt.linkedin.implementations.UserImplDAO;
import adt.linkedin.model.*;
import adt.linkedin.services.CompanyService;
import adt.linkedin.services.UserService;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();
        CompanyService companyService = new CompanyService();
        // User  FUNCIONA
        User raul = new User("Raul", "Chico",6565, "raul");
        userService.createUser(raul);
        //userService.removeUser(raul);


//        Agregando Habilidades y Educación
        Skill buenProgramador = new Skill("programación");
        userService.addSkill(raul, buenProgramador);
        Institution europa = new Institution("Europa");
        LocalDate fecha = LocalDate.of(2023, 2, 7);
        LocalDate fechaFin = LocalDate.of(2024, 2, 7);
        AcademicInfo infoRaul = new AcademicInfo(true,(float) 8.7, fechaFin, "DAM", europa);
        userService.addAcademicInfo(raul, infoRaul, europa);

        //COMPANY Y OFFER FUNCIONA
        Company accenture = new Company("Accenture", "explotadol");
        companyService.createCompany(accenture);
        JobOffer offer = new JobOffer("programador","Madrid");
        offer.setCompany(accenture);
        // Aplicando a una Oferta de Trabajo
        userService.addCandidature(raul,offer,"klkCurriculum","CartaKlk");

        // Experiencia Laboral
        WorkExperience raulExperiencia = new WorkExperience(true,fecha,"Extensa experiencia","Madrid",accenture);
        userService.addJobExperience(raul, raulExperiencia);
    }
}
