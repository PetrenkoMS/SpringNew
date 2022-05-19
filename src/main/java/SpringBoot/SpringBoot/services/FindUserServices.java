package SpringBoot.SpringBoot.services;

import SpringBoot.SpringBoot.DB.PeopleRepository;
import SpringBoot.SpringBoot.entity.PeopleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Бизнес-логика для поиска пользователя по серии и номеру паспорта
 */
@Transactional
@Service
public class FindUserServices {

    /**
     * Найденный пользователь
     */
    public static Object userz;

    @Autowired
    private PeopleRepository peopleRepository;

    /**
     * Загрузка страницы /findUser
     * @param model
     */
    public void fUsers(Model model) {
        model.addAttribute("user", new PeopleModel());
    }

    /**
     * Поиск пользователя по серии и номеру паспорта
     * @param user объект, который будет содержать найденного пользователя
     * @param model
     * @return если найден, то выводит его; если нет - выводит сообщение об отсутствии данного пользователя, и обновляет страницу
     */
    public ModelAndView findUser(PeopleModel user, Model model) {

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
            model.addAttribute("user", user);
            userz=user;
            returnThis = "findUsers";
        }
        return new ModelAndView(returnThis);
    }
}
