//package SpringBoot.SpringBoot.Controllers;
//
//import SpringBoot.SpringBoot.DB.PeopleRepository;
//import SpringBoot.SpringBoot.entity.PeopleModel;
//import SpringBoot.SpringBoot.services.FindUserServices;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//
//
//@RestController
//public class FindUserController {
//
//    public static Object userz;
//
//    private final FindUserServices findUserServices;
//
//    public FindUserController(FindUserServices findUserServices) {
//        this.findUserServices = findUserServices;
//    }
//
//    @GetMapping("/findUsers")
//    public ModelAndView fUsers(Model model) {
//        model.addAttribute("user", new PeopleModel());
//        return new ModelAndView("findUsers");
////        return "findUsers";
//    }
//
//    @Autowired
//    private PeopleRepository peopleRepository;
//
////    @PostMapping("/findUsers")
////    public ModelAndView findUser(@ModelAttribute PeopleModel user, Model model) {
////
////        String series = user.getSeriesPassport();
////        String number = user.getNumberPassport();
////        String returnThis = "findUsers";
////
////        List<PeopleModel> employSeriesAndNumber = this.peopleRepository.findBySeriesPassportAndNumberPassport(series,number);
////
////        if (employSeriesAndNumber.size() == 1) {
////            user = employSeriesAndNumber.get(0);
////            user.setEr("ok");
////            model.addAttribute("user", user);
////
////            userz=user;
////        }
////        else {
////            user.setEr("Данный пользователь не зарегистрирован!");
////            user.setSeriesPassport(null);
////            user.setNumberPassport(null);
//////            user.setName("Not found");
//////            user.setSecondName("Not found");
//////            user.setAge("Not found");
//////            user.setGender("Not found");
//////            user.setSeriesPassport("Not found");
//////            user.setNumberPassport("Not found");
//////            user.setTelephone("Not found");
//////            user.setAbout("Not found");
////            model.addAttribute("user", user);
////            userz=user;
////            returnThis = "findUsers";
////        }
////        return new ModelAndView(returnThis);
//////        return returnThis;
////    }
//
//    @PostMapping("/findUsers")
//    public ModelAndView findUser(@ModelAttribute PeopleModel user, Model model) {
//        return findUserServices.findUser(user, model);
//    }
//
//}
