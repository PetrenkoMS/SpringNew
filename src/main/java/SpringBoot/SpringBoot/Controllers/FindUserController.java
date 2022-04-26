package SpringBoot.SpringBoot.Controllers;

import SpringBoot.SpringBoot.DB.PeopleRepository;
import SpringBoot.SpringBoot.model.PeopleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class FindUserController {

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

        List<PeopleModel> employSeriesAndNumber = this.peopleRepository.findBySeriesPassportAndNumberPassport(series,number);

        user = employSeriesAndNumber.get(0);
        model.addAttribute("user", user);

        return "findUsers";
    }
}
