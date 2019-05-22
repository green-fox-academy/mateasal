package com.greenfoxacademy.webshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebshopController {

  @RequestMapping(value = "/webshop")

  public String greeting(Model model) {
    model.addAttribute("items", );
    model.addAttribute();
    model.addAttribute();
    model.addAttribute();
    return "greetings";
  }

}
