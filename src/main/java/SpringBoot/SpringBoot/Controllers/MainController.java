//package SpringBoot.SpringBoot.Controllers;
//
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//@RestController
//@RequestMapping("/")
//public class MainController {
//    @RequestMapping (method = RequestMethod.GET)
//    public ModelAndView home(Model model) {
//        model.addAttribute("title", "Главная страница"); //что передаем внутрь шаблона
//        return new ModelAndView("home");
////        return "home"; //имя шаблона
//    }
//
////    @GetMapping("/people") //какой обрабатываем сайт
////    public String people(Model model) {
////        model.addAttribute("title", "Главная страница"); //что передаем внутрь шаблона
////        return "people"; //имя шаблона
////    }
//}