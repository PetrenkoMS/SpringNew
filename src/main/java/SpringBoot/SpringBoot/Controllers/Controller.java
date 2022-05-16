package SpringBoot.SpringBoot.Controllers;

import SpringBoot.SpringBoot.DB.PeopleRepository;
import SpringBoot.SpringBoot.DB.UserRepository;
import SpringBoot.SpringBoot.entity.PeopleModel;
import SpringBoot.SpringBoot.services.*;
import com.itextpdf.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class Controller {

    public Controller(LoginService loginService, RegistrationService registrationService, FindUserServices findUserServices, GeneratePDFReport generatePDFReport, PDFExportService pDFExportService) {
        this.loginService = loginService;
        this.registrationService = registrationService;
        this.findUserServices = findUserServices;
        this.generatePDFReport = generatePDFReport;
        this.pDFExportService = pDFExportService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ModelAndView home(Model model) {
//        model.addAttribute("title", "Главная страница"); //что передаем внутрь шаблона
        return new ModelAndView("home");
    }

    private final LoginService loginService;

    @RequestMapping (method = RequestMethod.GET, value = "/login")
    public ModelAndView start(Model model, String error, String okay) {
        loginService.start(model, error, okay);
        return new ModelAndView("login");
    }

    private final RegistrationService registrationService;

    @RequestMapping(method = RequestMethod.GET, value = "/registration")
    public ModelAndView peopleForm(Model model) {
        registrationService.peopleForm(model);
        return new ModelAndView("registration");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/registration")
    public ModelAndView peopleSubmit(@ModelAttribute PeopleModel people, Model model) {
        return registrationService.peopleSubmit(people, model);
    }

    private final FindUserServices findUserServices;

    @RequestMapping(method = RequestMethod.GET, value = "/findUsers")
    public ModelAndView fUsers(Model model) {
        findUserServices.fUsers(model);
        return new ModelAndView("findUsers");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/findUsers")
    public ModelAndView findUser(@ModelAttribute PeopleModel user, Model model) {
        return findUserServices.findUser(user, model);
    }

    private final GeneratePDFReport generatePDFReport;
    private final PDFExportService pDFExportService;

    @GetMapping("/findUsers/pdf")
    public void generatePDF(HttpServletResponse response) throws DocumentException, IOException {
        pDFExportService.generatePDF(response);
    }
}
