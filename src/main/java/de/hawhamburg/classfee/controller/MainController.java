package de.hawhamburg.classfee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "index"; // lädt index.mustache
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("user", "Gast"); // später dynamisch
        return "dashboard";
    }
}
