package com.example.controllers;

import com.example.entities.User;
import com.example.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {
    final UserRepository userRepository;

    public ContactController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(path = "/contact")
    public ModelAndView ekle()
    {
        ModelAndView indexHtml = new ModelAndView("contact");
        indexHtml.addObject("yeni_user", new User());
        return indexHtml;
    }

    @PostMapping("/contact_ekle")
    public ModelAndView contect_ekle(@ModelAttribute(name = "user") User user){

        userRepository.save(user);
        return new ModelAndView("redirect:/contact");

    }

}
