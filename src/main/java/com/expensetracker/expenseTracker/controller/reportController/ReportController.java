package com.expensetracker.expenseTracker.controller.reportController;

import com.expensetracker.expenseTracker.dto.ReportDto;
import com.expensetracker.expenseTracker.service.ReportService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Getter
@Setter
@Controller
@RequestMapping("/report")
public class ReportController {

    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    // Show the form page
    @GetMapping()
    public String showForm(Model model) {
        model.addAttribute("content", "report");
        model.addAttribute("report", new ReportDto()); // Thymeleaf HTML file
        return "layout";
    }



    @GetMapping("/")
    public String root() {
        return "redirect:/index";
    }

}
