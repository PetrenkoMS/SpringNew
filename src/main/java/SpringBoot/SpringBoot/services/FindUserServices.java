package SpringBoot.SpringBoot.services;

import SpringBoot.SpringBoot.DB.PeopleRepository;
import SpringBoot.SpringBoot.entity.PeopleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
public class FindUserServices {

    public static Object userz;

    @Autowired
    private PeopleRepository peopleRepository;

    public void fUsers(Model model) {
        model.addAttribute("user", new PeopleModel());
    }

    public ModelAndView findUser(@ModelAttribute PeopleModel user, Model model) {

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
        return new ModelAndView(returnThis);
//        return returnThis;
    }
}
