package SpringBoot.SpringBoot.services;

import SpringBoot.SpringBoot.DB.PeopleRepository;
import SpringBoot.SpringBoot.DB.UserRepository;
import SpringBoot.SpringBoot.entity.PeopleModel;
import SpringBoot.SpringBoot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.security.SecureRandom;
import java.util.List;

@Service
public class RegistrationService {

    @Autowired
    private PeopleRepository peopleRepository;

    @Autowired
    private UserRepository userRepository;

    public void peopleForm(Model model) {
        model.addAttribute("people", new PeopleModel());
    }

    public ModelAndView peopleSubmit(@ModelAttribute PeopleModel people, Model model) {
        int strength = 12;
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(strength, new SecureRandom());

        String returnPage = "home";
        List<PeopleModel> employLogin = this.peopleRepository.findByLogin(people.getLogin());
        List<PeopleModel> employSeriesAndNumber = this.peopleRepository.findBySeriesPassportAndNumberPassport(people.getSeriesPassport(),
                people.getNumberPassport());
        if (employLogin.size() == 0) {
            if (employSeriesAndNumber.size() == 0) {
                User userNew = new User();
                userNew.setUserName(people.getLogin());
                userNew.setPassword(bCryptPasswordEncoder.encode(people.getPassword()));
                userNew.setActive(true);
                userNew.setRoles("ROLE_USER");
                userRepository.save(userNew);
                peopleRepository.save(people);
                people = new PeopleModel();
                people.setEr("Регистрация прошла успешно");
                returnPage = "home";
            } else {
                people = new PeopleModel();
                people.setEr("Вы уже использовали данный паспорт для регистрации");
                returnPage = "registration";
            }
        } else {
            people = new PeopleModel();
            people.setEr("Этот логин уже занят");
            returnPage = "registration";
        }
        model.addAttribute("people", people);
        return new ModelAndView(returnPage);
    }
}
