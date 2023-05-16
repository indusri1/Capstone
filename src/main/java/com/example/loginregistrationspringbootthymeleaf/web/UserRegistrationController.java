package com.example.loginregistrationspringbootthymeleaf.web;

import com.example.loginregistrationspringbootthymeleaf.service.UserService;
import com.example.loginregistrationspringbootthymeleaf.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.BindingResult;


@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
    private UserService userService;

    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }
    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }
    @GetMapping
    public String showRegistrationForm() {
        return "registration";
    }
    @PostMapping
    public String registerUserAccount(@ModelAttribute("user")UserRegistrationDto registrationDto , BindingResult result) {
        userService.save(registrationDto);
        return "redirect://registration?success";
    }
}
