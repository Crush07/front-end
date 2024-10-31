package com.hysea.growth.standard.controller;

import com.hysea.growth.standard.domain.entity.GrowthStandard;
import com.hysea.growth.standard.service.GrowthStandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/growth/standard")
public class StandardController {

    @Autowired
    GrowthStandardService growthStandardService;

    @GetMapping("/list")
    public String list(Model model) {

        List<GrowthStandard> list = growthStandardService.list();
        model.addAttribute("growthStandards",list);

        return "/growth/standard/list"; // list.html
    }

    @GetMapping("/new")
    public String form(Model model) {

        GrowthStandard growthStandard = new GrowthStandard();
        model.addAttribute("growthStandard",growthStandard);
        model.addAttribute("pageTitle", "Create new Tutorial");

        return "/growth/standard/new"; // new.html
    }

    @PostMapping("/add")
    public String add(GrowthStandard growthStandard, RedirectAttributes redirectAttributes) {

        growthStandardService.save(growthStandard);

        redirectAttributes.addFlashAttribute("message", "The Tutorial has been saved successfully!");
        return "redirect:/growth/standard/list"; // list.html
    }

}