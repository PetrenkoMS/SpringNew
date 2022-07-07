package SpringBoot.SpringBoot.services;

import SpringBoot.SpringBoot.DB.PeopleRepository;
import SpringBoot.SpringBoot.entity.PeopleModel;
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

    @Autowired
    private PeopleRepository peopleRepository;

    public void fSomeUsers(Model model) {
        model.addAttribute("someUsers", new PeopleModel());
    }

    public ModelAndView findSomeUsers(PeopleModel someUsers, Model model) {
        String series = someUsers.getSeriesPassport();
        String number = someUsers.getNumberPassport();
        String returnThis = "findSomeUsers";

        List<PeopleModel> employSeriesAndNumber = this.peopleRepository.findBySeriesPassportAndNumberPassport(series,number);

        if (employSeriesAndNumber.size() == 1) {
            someUsers = employSeriesAndNumber.get(0);
            someUsers.setEr("ok");
            model.addAttribute("someUsers", someUsers);

            someUserz.add(someUsers);
            System.out.println(someUserz.size());
        }
        else {
            someUsers.setEr("Данный пользователь не зарегистрирован!");
            someUsers.setSeriesPassport(null);
            someUsers.setNumberPassport(null);
            model.addAttribute("someUsers", someUsers);
            returnThis = "findSomeUsers";
        }

        return new ModelAndView(returnThis);
    }

}
