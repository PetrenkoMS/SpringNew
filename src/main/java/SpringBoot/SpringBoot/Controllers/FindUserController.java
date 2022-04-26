package SpringBoot.SpringBoot.Controllers;

import SpringBoot.SpringBoot.DB.PeopleRepository;
import SpringBoot.SpringBoot.model.PeopleModel;
import SpringBoot.SpringBoot.services.GeneratePDFReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;


@Controller
public class FindUserController {

    public static Object userz;

    @GetMapping("/findUsers")
    public String fUsers(Model model) {
        model.addAttribute("user", new PeopleModel());
        return "findUsers";
    }

    @Autowired
    private PeopleRepository peopleRepository;

    @PostMapping("/findUsers")
    public String findUser(@ModelAttribute PeopleModel user, Model model) {

        String series = user.getSeriesPassport();
        String number = user.getNumberPassport();
        String returnThis = "findUsers";

        List<PeopleModel> employSeriesAndNumber = this.peopleRepository.findBySeriesPassportAndNumberPassport(series,number);

        if (employSeriesAndNumber.size() == 1) {
            user = employSeriesAndNumber.get(0);
            user.setEr("ok");
            model.addAttribute("user", user);

            userz=user;
        }
        else {
            user.setEr("Данный пользователь не зарегистрирован!");
            user.setSeriesPassport(null);
            user.setNumberPassport(null);
//            user.setName("Not found");
//            user.setSecondName("Not found");
//            user.setAge("Not found");
//            user.setGender("Not found");
//            user.setSeriesPassport("Not found");
//            user.setNumberPassport("Not found");
//            user.setTelephone("Not found");
//            user.setAbout("Not found");
            model.addAttribute("user", user);
            userz=user;
            returnThis = "findUsers";
        }
        return returnThis;
    }
}
