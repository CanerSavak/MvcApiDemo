package com.example.controllers;

import com.example.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/think")
public class ThinkController {
    final UserRepository userRepository;

    public ThinkController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(path = "")
    public ModelAndView think(HttpServletRequest request)
    {
        ModelAndView indexHtml = new ModelAndView("thinks");
        indexHtml.addObject("user_list", userRepository.findAll());
        return indexHtml;
    }
}
