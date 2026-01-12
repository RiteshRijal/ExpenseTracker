package com.expensetracker.expenseTracker.controller;

import com.expensetracker.expenseTracker.repository.DemoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    private final DemoRepository demoRepository;

    public DemoController(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @GetMapping("/demo")
    public String showDemo(Model model) {
        model.addAttribute("list", demoRepository.findAll());
        return "demo";
    }
}
