package com.example.quanlydoibong.controller;

import com.example.quanlydoibong.model.CauThu;
import com.example.quanlydoibong.service.CauThuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cauthu")
public class CauThuController {

    @Autowired
    private CauThuService service;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("dsCauThu", service.findAll());
        return "list";
    }

    @GetMapping("/new")
    public String form(Model model) {
        model.addAttribute("cauThu", new CauThu());
        return "form";
    }

    @PostMapping
    public String save(@ModelAttribute CauThu cauThu) {
        service.save(cauThu);
        return "redirect:/cauthu";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("cauThu", service.findById(id));
        return "form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteById(id);
        return "redirect:/cauthu";
    }
}
