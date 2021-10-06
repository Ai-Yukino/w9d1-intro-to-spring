package com.tts.w9d1HW.controllers;

import com.tts.w9d1HW.Tea;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TeaController {

    @GetMapping("/tea")
    public String teaForm(Model model) {
        model.addAttribute("tea", new Tea());
        return "tea";
    }

    @PostMapping("/tea")
    public String teaSubmit(@ModelAttribute Tea tea, Model model) {
        model.addAttribute("tea", tea);
        return "teaResult";
    }
}
