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
import java.util.List;

/**
 * Контроллеры для общения backend и frontend
 */
@RestController
public class Controller {

    private final LoginService loginService;
    private final RegistrationService registrationService;
    private final FindUserServices findUserServices;
    private final GeneratePDFReport generatePDFReport;
    private final PDFExportService pDFExportService;
    private final FindSomeUsersServices findSomeUsersServices;

    /**
     * Конструктор для controller
     * @param loginService - бизнес-логика для аутентификации
     * @param registrationService - бизнес-логика для регистрации пользователя
     * @param findUserServices - бизнес-логика для поиска пользователя
     * @param generatePDFReport - бизнес-логика для генерации pdf файла
     * @param pDFExportService - бизнес-логика для создания и заполнения pdf файла
     */
    public Controller(LoginService loginService, RegistrationService registrationService, FindUserServices findUserServices, FindSomeUsersServices findSomeUsersServices, GeneratePDFReport generatePDFReport, PDFExportService pDFExportService) {
        this.loginService = loginService;
        this.registrationService = registrationService;
        this.findUserServices = findUserServices;
        this.generatePDFReport = generatePDFReport;
        this.pDFExportService = pDFExportService;
        this.findSomeUsersServices = findSomeUsersServices;
    }

    /**
     * Загрузка главной страницы
     * @param model
     * @return Загрузка главной страницы
     */
    @GetMapping(value = "/")
    public ModelAndView home(Model model) {
        return new ModelAndView("home");
    }

    /**
     * Загрузка страницы для аутентификации
     * @param model
     * @param error
     * @param okay
     * @return Загрузка страницы для аутентификации
     */
    @GetMapping(value = "/login")
    public ModelAndView start(Model model, String error, String okay) {
        loginService.start(model, error, okay);
        return new ModelAndView("login");
    }

    /**
     * Загрузка страницы для регистрации
     * @param model
     * @return Загрузка страницы для регистрации
     */
    @GetMapping(value = "/registration")
    public ModelAndView peopleForm(Model model) {
        registrationService.peopleForm(model);
        return new ModelAndView("registration");
    }

    /**
     * Передача данных со страницы для регистрации на обработку (или ошибки)
     * @param people
     * @param model
     * @return Бизнес-логика registrationService
     */
    @PostMapping(value = "/registration")
    public ModelAndView peopleSubmit(PeopleModel people, Model model) {
        return registrationService.peopleSubmit(people, model);
    }

    /**
     * Загрузка страницы для поиска пользователя
     * @param model
     * @return Загрузка страницы для поиска пользователя
     */
    @GetMapping(value = "/findUsers")
    public ModelAndView fUsers(Model model) {
        findUserServices.fUsers(model);
        return new ModelAndView("findUsers");
    }

    /**
     * Передача данных на страницу найденного пользователя (или ошибки)
     * @param user
     * @param model
     * @return Бизнес-логика findUserServices
     */
    @PostMapping(value = "/findUsers")
    public ModelAndView findUser(PeopleModel user, Model model) {
        return findUserServices.findUser(user, model);
    }

    /**
     * Создание pdf файла с данными о найденном пользователе
     * @param response
     * @throws DocumentException
     * @throws IOException
     */
    @GetMapping("/findUsers/pdf")
    public void generatePDF(HttpServletResponse response) throws DocumentException, IOException {
        pDFExportService.generatePDF(response);
    }

    @GetMapping(value="/findSomeUsers")
    public ModelAndView fSomeUsers(Model model) {
        findSomeUsersServices.fSomeUsers(model);
        return new ModelAndView("findSomeUsers");
    }

    @PostMapping(value= "/findSomeUsers")
    public ModelAndView findSomeUsers(PeopleModel someUsers, Model model) {
        return findSomeUsersServices.findSomeUsers(someUsers, model);
    }
}
