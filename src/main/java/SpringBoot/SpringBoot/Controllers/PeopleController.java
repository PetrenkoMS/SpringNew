//package SpringBoot.SpringBoot.Controllers;
//
//import SpringBoot.SpringBoot.DB.PeopleRepository;
////import SpringBoot.SpringBoot.services.PeopleService;
//import SpringBoot.SpringBoot.DB.UserRepository;
//import SpringBoot.SpringBoot.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import SpringBoot.SpringBoot.entity.PeopleModel;
//
//import java.security.SecureRandom;
//import java.util.List;
//
//@Controller
//public class PeopleController {
////    private PeopleService peopleService = new PeopleService();
//
//    @Autowired
//    private PeopleRepository peopleRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
////    @PostMapping("/people")
////    public @ResponseBody String addNewPeople (@RequestParam String name, @RequestParam String secondName) {
////
////        PeopleModel n = new PeopleModel();
////        n.setName(name);
////        n.setSecondName(secondName);
////        peopleRepository.save(n);
////        return "Saved";
////    }
//
//    @GetMapping("/registration")
//    public String peopleForm(Model model) {
//        model.addAttribute("people", new PeopleModel());
//        return "registration";
//    }
//
//
//    @PostMapping("/registration")
//    public String peopleSubmit(@ModelAttribute PeopleModel people, Model model) {
////        model.addAttribute("people", people);
////        String login = people.getLogin();
////        String password = people.getPassword();
////        String name = people.getName();
////        String secondName = people.getSecondName();
////        String age = people.getAge();
////        String gender = people.getGender();
////        String series = people.getSeriesPassport();
////        String number = people.getNumberPassport();
////        String telephone = people.getTelephone();
//
//        int strength = 12; // work factor of bcrypt
//        BCryptPasswordEncoder bCryptPasswordEncoder =
//                new BCryptPasswordEncoder(strength, new SecureRandom());
//
//        String returnPage = "home";
////        List<PeopleModel> employLogin = this.peopleRepository.findByLogin(login);
////        List<PeopleModel> employSeriesAndNumber = this.peopleRepository.findBySeriesPassportAndNumberPassport(series,number);
//        List<PeopleModel> employLogin = this.peopleRepository.findByLogin(people.getLogin());
//        List<PeopleModel> employSeriesAndNumber = this.peopleRepository.findBySeriesPassportAndNumberPassport(people.getSeriesPassport(),
//                                                                                                            people.getNumberPassport());
////        PeopleModel peopleNew = new PeopleModel();
//        if (employLogin.size() == 0){
//            if (employSeriesAndNumber.size() == 0) {
////                peopleNew.setLogin(login);
////                peopleNew.setPassword(password);
////                peopleNew.setName(name);
////                peopleNew.setSecondName(secondName);
////                peopleNew.setAge(age);
////                peopleNew.setGender(gender);
////                peopleNew.setSeriesPassport(series);
////                peopleNew.setNumberPassport(number);
////                peopleNew.setTelephone(telephone);
//
////                peopleRepository.save(peopleNew);
//                User userNew = new User();
//                userNew.setUserName(people.getLogin());
//                userNew.setPassword(bCryptPasswordEncoder.encode(people.getPassword()));
//                userNew.setActive(true);
//                userNew.setRoles("ROLE_USER");
////                people.setPassword(bCryptPasswordEncoder.encode(people.getPassword()));
//                userRepository.save(userNew);
//                peopleRepository.save(people);
//                people = new PeopleModel();
//                people.setEr("?????????????????????? ???????????? ??????????????");
//                returnPage = "home";
////                List<PeopleModel> peopleInfoForList = (List<PeopleModel>) people;
////                ByteArrayInputStream peopleInfo = GeneratePDFReport.peopleReport(peopleInfoForList);
////                HttpHeaders headers = new HttpHeaders();
////                headers.add("Content-Disposition", "inline; filename=peoplereport.pdf");
//
//            }
//            else {
//                people = new PeopleModel();
////                peopleNew.setEr("???? ?????? ???????????????????????? ???????????? ?????????????? ?????? ??????????????????????");
//                people.setEr("???? ?????? ???????????????????????? ???????????? ?????????????? ?????? ??????????????????????");
//                returnPage = "registration";
//            }
//        }
//        else {
//            people = new PeopleModel();
////            peopleNew.setEr("???????? ?????????? ?????? ??????????");
//            people.setEr("???????? ?????????? ?????? ??????????");
//            returnPage = "registration";
//        }
//
////        PeopleModel peopleNew = new PeopleModel();
////        peopleNew.setLogin(login);
////        peopleNew.setPassword(password);
////        peopleNew.setName(name);
////        peopleNew.setSecondName(secondName);
////        peopleNew.setAge(age);
////        peopleNew.setGender(gender);
////        peopleNew.setSeriesPassport(series);
////        peopleNew.setNumberPassport(number);
////        peopleNew.setTelephone(telephone);
////
////
////        peopleRepository.save(peopleNew);
////        return "people";
//        model.addAttribute("people", people);
//        return returnPage;
//    }
//
////    @RequestMapping("/people")
////    public @ResponseBody String welcome(){
////        PeopleModel people = peopleService.list();
////        String name = people.get(0).getName();
////        int age = people.get(0).getAge();
////        String secondName = people.get(0).getSecondName();
////
////        String peoples = name + " " + secondName + " " + age;
////        return peoples;
////    }
//
////    @GetMapping(path = "/people")
////    public List<PeopleModel> list() {
////        return peopleService.list();
////    }
//}
