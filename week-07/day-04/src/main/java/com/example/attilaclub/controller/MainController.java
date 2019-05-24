package com.example.attilaclub.controller;

import com.example.attilaclub.model.Attila;
import com.example.attilaclub.service.AttilaServices;
import com.example.attilaclub.service.DrinkServices;
import com.example.attilaclub.service.FoodServices;
import com.example.attilaclub.service.TrickServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  private AttilaServices attilaServices;
  private FoodServices foodServices;
  private DrinkServices drinkServices;
  private TrickServices trickServices;

  public MainController(AttilaServices attilaServices, FoodServices foodServices, DrinkServices
                        drinkServices, TrickServices trickServices) {
    this.attilaServices = attilaServices;
    this.foodServices = foodServices;
    this.drinkServices = drinkServices;
    this.trickServices = trickServices;
  }

  @GetMapping("/attilaclub")
  public String newIndex(@RequestParam(required = false) String name, Model model) {
    if (name == null) {
      return "login";
    } else if (attilaServices.search(name)) {
      Attila attila = attilaServices.find(name);
      model.addAttribute("attila", attila);
      return "index";
    } else {
      Attila attila = attilaServices.find(name);
      model.addAttribute("attila", attila);
      attilaServices.save(attila);
      return "index";
    }
  }

  @GetMapping("/attilaclub/nutrition")
  public String getNutrition(Model model, @RequestParam (required = false) String name) {
    model.addAttribute("list", foodServices.findAll());
    model.addAttribute("drinkList", drinkServices.findAll());
    model.addAttribute("name", name);
    return "nutrition";
  }

  @GetMapping("/attilaclub/tricks")
  public String getTricks(Model model, @RequestParam (required = false) String name) {
    model.addAttribute("list", trickServices.findAll());
    model.addAttribute("name", name);
    return "tricks";
  }

  @GetMapping("/attilaclub/attilarepo")
  public String getAttilas(Model model, @RequestParam (required = false) String name) {
    model.addAttribute("list", attilaServices.getAttilas());
    model.addAttribute("name", name);
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
