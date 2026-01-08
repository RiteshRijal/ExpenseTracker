package com.expensetracker.expenseTracker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExpenseIndexPageController {

    @GetMapping("/")
    public String home() {
        return "index";  // this should match your index.html file
    }
}

