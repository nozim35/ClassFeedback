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

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("user", "Gast"); // später dynamisch
        return "dashboard";
    }

    @GetMapping("/module")
    public String module() {
        return "module";
    }

    @GetMapping("/feedbacks")
    public String feedbacks() {
        return "feedbacks";
    }

    @GetMapping("/semester")
    public String semester() {
        return "semester";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/feedback_form")
    public String feedback_form() {
        return "feedback_form";
    }

}
