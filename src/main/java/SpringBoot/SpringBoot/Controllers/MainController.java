package SpringBoot.SpringBoot.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping (method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("title", "Главная страница"); //что передаем внутрь шаблона
        return "home"; //имя шаблона
    }

//    @GetMapping("/people") //какой обрабатываем сайт
//    public String people(Model model) {
//        model.addAttribute("title", "Главная страница"); //что передаем внутрь шаблона
//        return "people"; //имя шаблона
//    }
}