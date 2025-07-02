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
    @GetMapping("/mathe1")
    public String mathe1() { return "module_subseiten/mathe1"; }

    @GetMapping("/informatik1")
    public String informatik1() { return "module_subseiten/informatik1"; }

    @GetMapping("/programmieren1")
    public String programmieren1() { return "module_subseiten/programmieren1"; }

    @GetMapping("/media_game_design1")
    public String media_game_design1() { return "module_subseiten/media_game_design1"; }

    @GetMapping("/medienrecht")
    public String medienrecht() { return "module_subseiten/medienrecht"; }

    @GetMapping("/dramaturgie1")
    public String dramaturgie1() { return "module_subseiten/dramaturgie1"; }

    @GetMapping("/wintersemester24_25")
    public String wintersemester24_25() { return "module_subseiten/wintersemester24_25"; }

    @GetMapping("/sommersemester25")
    public String sommersemester25() { return "module_subseiten/sommersemester25"; }

}


