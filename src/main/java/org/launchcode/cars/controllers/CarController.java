package org.launchcode.cars.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class CarController {

    @GetMapping("/")
    public String index(Model model) {
        ArrayList<String> makes = new ArrayList<>();
        makes.add("Ford");
        makes.add("Honda");
        model.addAttribute("makes", makes);
        return "index";
    }
}
