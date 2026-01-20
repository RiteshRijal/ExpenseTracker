package com.expensetracker.expenseTracker.controller.expenseParameterMapController;

import com.expensetracker.expenseTracker.dto.ExpenseParameterMapDto;
import com.expensetracker.expenseTracker.service.ExpenseParameterMapService;
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
@RequestMapping("/expenseParameterMap")
public class ExpenseParameterMapController {

    private final ExpenseParameterMapService expenseParameterMapService;

    public ExpenseParameterMapController(ExpenseParameterMapService expenseParameterMapService) {
        this.expenseParameterMapService = expenseParameterMapService;
    }

    // Show the form page
    @GetMapping()
    public String showForm(Model model) {
        model.addAttribute("content", "expenseParameterMaps");
        model.addAttribute("expenseParameterMap", new ExpenseParameterMapDto()); // Thymeleaf HTML file
        return "layout";
    }

    // Handle form submission
    @PostMapping
    public String save(@ModelAttribute ExpenseParameterMapDto expenseParameterMapDto, RedirectAttributes redirectAttributes) {
        boolean saved = expenseParameterMapService.save(expenseParameterMapDto);
        if (saved) {
            redirectAttributes.addFlashAttribute("message", "✅ ExpenseParameterMap saved successfully!");
        } else {
            redirectAttributes.addFlashAttribute("message", "❌ Failed to save expenseParameterMap.");
        }
        return "redirect:/expenseParameterMap";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/index";
    }

}
