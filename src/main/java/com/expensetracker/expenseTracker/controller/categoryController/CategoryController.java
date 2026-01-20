package com.expensetracker.expenseTracker.controller.categoryController;

import com.expensetracker.expenseTracker.dto.AdminDto;
import com.expensetracker.expenseTracker.dto.CategoryDto;
import com.expensetracker.expenseTracker.service.AdminService;
import com.expensetracker.expenseTracker.service.CategoryService;
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
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    private final AdminService adminService;

    private CategoryDto categoryDto;

    private AdminDto adminDto;

    private RedirectAttributes redirectAttributes;

    public CategoryController(CategoryService categoryService, AdminService adminService) {
        this.categoryService = categoryService;
        this.adminService =  adminService;
        categoryDto=new CategoryDto();
        adminDto= adminService.getAdminById(1L);
    }

    // Show the form page
    @GetMapping()
    public String showForm(Model model) {
        model.addAttribute("content", "category");
        model.addAttribute("category", new CategoryDto());
        return "layout";
    }

    // Handle form submission



    @PostMapping
    public String save() {
        categoryDto.setAdminDto(adminDto);
        boolean saved = categoryService.save(categoryDto);
        if (saved) {
            redirectAttributes.addFlashAttribute("message", "✅ Expense saved successfully!");
        } else {
            redirectAttributes.addFlashAttribute("message", "❌ Failed to save expense.");
        }
        return "redirect:/category";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/index";
    }



}
