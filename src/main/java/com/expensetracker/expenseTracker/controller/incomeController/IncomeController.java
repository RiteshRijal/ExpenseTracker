package com.expensetracker.expenseTracker.controller.incomeController;

import com.expensetracker.expenseTracker.dto.IncomeDto;
import com.expensetracker.expenseTracker.service.IncomeService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Getter
@Setter
@Controller
@RequestMapping("/income")
public class IncomeController {

    private final IncomeService incomeService;

    public IncomeController(IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    // Show the form page
    @GetMapping()
    public String showForm(Model model) {
        model.addAttribute("content", "income");
        model.addAttribute("income", new IncomeDto()); // Thymeleaf HTML file
        return "layout";
    }

    // Handle form submission
    @PostMapping
    public String save(@ModelAttribute IncomeDto incomeDto, RedirectAttributes redirectAttributes) {
        boolean saved = incomeService.save(incomeDto);
        if (saved) {
            redirectAttributes.addFlashAttribute("message", "✅ Income saved successfully!");
        } else {
            redirectAttributes.addFlashAttribute("message", "❌ Failed to save income.");
        }
        return "redirect:/income";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/index";
    }

}
