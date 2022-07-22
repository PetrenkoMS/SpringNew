package SpringBoot.SpringBoot.services;

import SpringBoot.SpringBoot.DB.PeopleRepository;
import SpringBoot.SpringBoot.entity.PeopleModel;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;




@Transactional
@Service
public class FindSomeUsersServices {

    public static List<Object> someUserz = new ArrayList<>();

    private static final Logger logger = LogManager.getLogger(FindSomeUsersServices.class);

    @Autowired
    private PeopleRepository peopleRepository;

    public void fSomeUsers(Model model) {
        model.addAttribute("someUsers", new PeopleModel());
    }

    public ModelAndView findSomeUsers(PeopleModel someUsers, Model model) {

        String param = someUsers.getSelectParam();
        String selectedUser;
        List<PeopleModel> employUsers = null;
        String pattern = null;
        String patternTitle = null;
        switch (param) {
            case "name":
                selectedUser = someUsers.getGender();
                employUsers = this.peopleRepository.findByName(selectedUser);
                pattern = "^[A-Za-zА-Яа-яЁё\\s]{2,}";
                patternTitle = "Минимум 2 буквы без цифр и спец. символов";
                break;

            case "secondName":
                selectedUser = someUsers.getGender();
                employUsers = this.peopleRepository.findBySecondName(selectedUser);
                pattern = "^[A-Za-zА-Яа-яЁё\\s]{2,}";
                patternTitle = "Минимум 2 буквы без цифр и спец. символов";
                break;

            case "age":
                selectedUser = someUsers.getGender();
                employUsers = this.peopleRepository.findByAge(selectedUser);
                pattern = "[0-9]{2,3}";
                patternTitle = "Введите корректный возраст (от 2 до 3 цифр)";
                break;

            case "gender":
                selectedUser = someUsers.getGender();
                employUsers = this.peopleRepository.findByGender(selectedUser);
                pattern = "male | female";
                patternTitle = "Введите male (м) или female (ж)";
                break;

            case "seriesPassport":
                selectedUser = someUsers.getGender();
                employUsers = this.peopleRepository.findBySeriesPassport(selectedUser);
                pattern = "[0-9]{4}";
                patternTitle = "4 цифры";
                break;

            case "numberPassport":
                selectedUser = someUsers.getGender();
                employUsers = this.peopleRepository.findByNumberPassport(selectedUser);
                pattern = "[0-9]{6}";
                patternTitle = "6 цифр";
                break;

            case "telephone":
                selectedUser = someUsers.getGender();
                employUsers = this.peopleRepository.findByTelephone(selectedUser);
                pattern = "[0-9]{11}";
                patternTitle = "11 цифр (x-xxx-xxx-xx-xx)";
                break;

            case "login":
                selectedUser = someUsers.getGender();
                employUsers = this.peopleRepository.findByLogin(selectedUser);
                pattern = ".{3,}";
                patternTitle = "Минимум 3 символа";
                break;
        }

        logger.info("Переданный параметр: " + param);

        String returnThis = "findSomeUsers";

        if (employUsers.size() >= 1) {
//            someUsers = employName.get(0);
            someUsers.setEr("ok");
            someUsers.setPattern(pattern);
            someUsers.setTitlePattern(patternTitle);
            model.addAttribute("someUsers", someUsers);
            model.addAttribute("employUsers", employUsers);

            logger.info("Size of employ: " + employUsers.size());

            someUserz.add(someUsers);
        } else {
            someUsers.setEr("Данный пользователь не зарегистрирован!");
            someUsers.setSeriesPassport(null);
            someUsers.setNumberPassport(null);
            someUsers.setPattern(pattern);
            someUsers.setTitlePattern(patternTitle);
            model.addAttribute("someUsers", someUsers);
            model.addAttribute("employUsers", employUsers);
            returnThis = "findSomeUsers";
        }


        return new ModelAndView(returnThis);
    }

}
