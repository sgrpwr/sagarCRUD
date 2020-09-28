package com.sagar.controller;

import com.sagar.entity.Sagar;
import com.sagar.service.SagarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class SagarController {

    @Autowired
    private SagarService sagarService;

    @GetMapping("/list")
    public String listCustomers(Model theModel) {
        List<Sagar> theCustomers = sagarService.getCustomers();
        theModel.addAttribute("customers", theCustomers);
        return "list-customers";
    }

}
