package com.expensetracker.expenseTracker.controller.expenseController;

import com.expensetracker.expenseTracker.dto.ExpenseDto;
import com.expensetracker.expenseTracker.service.ExpenseService;
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
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    // Show the form page
    @GetMapping()
    public String showForm(Model model) {
        model.addAttribute("expense", new ExpenseDto());
        return "expenses"; // Thymeleaf HTML file
    }

    // Handle form submission
    @PostMapping
    public String save(@ModelAttribute ExpenseDto expenseDto, RedirectAttributes redirectAttributes) {
        boolean saved = expenseService.save(expenseDto);
        if (saved) {
            redirectAttributes.addFlashAttribute("message", "✅ Expense saved successfully!");
        } else {
            redirectAttributes.addFlashAttribute("message", "❌ Failed to save expense.");
        }
        return "redirect:/expenses";
    }
}
