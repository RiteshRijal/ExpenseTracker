package com.expensetracker.expenseTracker.controller.balanceController;

import com.expensetracker.expenseTracker.dto.BalanceDto;
import com.expensetracker.expenseTracker.service.BalanceService;
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
@RequestMapping("/balance")
public class BalanceController {

    private final BalanceService balanceService;

    public BalanceController(BalanceService balanceService) {
        this.balanceService = balanceService;
    }

    // Show the form page
    @GetMapping()
    public String showForm(Model model) {
        model.addAttribute("content", "balance");
        model.addAttribute("balance", new BalanceDto()); // Thymeleaf HTML file
        return "layout";
    }

    // Handle form submission
    @PostMapping
    public String save(@ModelAttribute BalanceDto balanceDto, RedirectAttributes redirectAttributes) {
        boolean saved = balanceService.save(balanceDto);
        if (saved) {
            redirectAttributes.addFlashAttribute("message", "✅ Balance saved successfully!");
        } else {
            redirectAttributes.addFlashAttribute("message", "❌ Failed to save balance.");
        }
        return "redirect:/balance";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/index";
    }

}
