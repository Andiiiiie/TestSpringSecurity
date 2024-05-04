package mg.itu.controller;

import mg.itu.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class UserController {
    @GetMapping("/login")
    public String login(@ModelAttribute("user") User user) {
        return "global/login";
    }

    @GetMapping("/")
    public String home() {
        return "global/home";
    }
}
