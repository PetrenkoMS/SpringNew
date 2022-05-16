package SpringBoot.SpringBoot.services;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Service
public class LoginService {
    public void start(Model model, String error, String okay) {
        model.addAttribute("error", error);
        model.addAttribute("okay", okay);

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    }
}
