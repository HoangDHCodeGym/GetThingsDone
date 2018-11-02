package com.codegym.controller;

import com.codegym.model.Thing;
import com.codegym.service.GodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class GodController {
    @Autowired
    GodService godService;

    @GetMapping("/")
    public String index(Model model) {
        List<Thing> listOfThings = godService.findAll();
        model.addAttribute("listOfThings", listOfThings);
        return "index";
    }

    @GetMapping("/thing")
    public String createAThing(Model model) {
        model.addAttribute("thing", new Thing());
        return "create";
    }

    @PostMapping("/thing")
    public String saveAThing(Model model, @ModelAttribute("thing") Thing thing) {
        godService.save(thing);
        model.addAttribute("message", "Thing created!");
        return "create";
    }
}
