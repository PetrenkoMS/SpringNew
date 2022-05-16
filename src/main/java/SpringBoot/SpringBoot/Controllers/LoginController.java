//package SpringBoot.SpringBoot.Controllers;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//
//@RestController
////@RequestMapping("/login")
//public class LoginController {
//
//    @RequestMapping (method = RequestMethod.GET, value = "/login")
//    public ModelAndView start(Model model, @RequestParam(required = false) String error, @RequestParam(required = false) String okay) {
//       model.addAttribute("error", error);
//       model.addAttribute("okay", okay);
//
//       Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
////       String currentUserName = "";
////       if (!(authentication instanceof AnonymousAuthenticationToken)) {
////           currentUserName = authentication.getName();
////           return currentUserName;
////       }
////       System.out.println("###############################");
////       System.out.println("user: " + currentUserName);
//
//      return new ModelAndView("login");
////      return "login";
//   }
//
//
//}
