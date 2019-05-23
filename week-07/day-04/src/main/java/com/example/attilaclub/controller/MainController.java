package com.example.attilaclub.controller;

import com.example.attilaclub.model.Attila;
import com.example.attilaclub.service.AttilaServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  private AttilaServices attilaServices;

  public MainController(AttilaServices attilaServices) {
    this.attilaServices = attilaServices;
  }

  @GetMapping("/attilaclub")
  public String newIndex(@RequestParam(required = false) String name, Model model) {
    if (name == null) {
      return "login";
    } else {
      Attila attila = new Attila(name);
      model.addAttribute("name", attila.getName());
      attilaServices.save(attila);
      return "index";
    }
  }

  @GetMapping("/attilaclub/attilarepo")
  public String Greenfox(Model model) {
    model.addAttribute("list", attilaServices.getAttilas());
    return "attilarepo";
  }

  @GetMapping("/attilaclub/login")
  public String nameCheck() {
    return "login";
  }

  @PostMapping("/attilaclub/login")
  public String createAttila(String name) {
    return "redirect:/attilaclub?name=" + name;
  }
}
