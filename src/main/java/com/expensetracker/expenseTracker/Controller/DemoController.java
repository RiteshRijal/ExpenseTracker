package com.expensetracker.expenseTracker.Controller;

import com.expensetracker.expenseTracker.repository.DemoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

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
