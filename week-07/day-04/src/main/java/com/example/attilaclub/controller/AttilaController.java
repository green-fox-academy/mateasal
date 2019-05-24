package com.example.attilaclub.controller;

import com.example.attilaclub.model.Attila;
import com.example.attilaclub.service.AttilaServices;
import com.example.attilaclub.service.DrinkServices;
import com.example.attilaclub.service.FoodServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AttilaController {

  private FoodServices foodServices;
  private DrinkServices drinkServices;
  private AttilaServices attilaServices;

  public AttilaController(FoodServices foodServices, DrinkServices
          drinkServices, AttilaServices attilaServices) {
    this.foodServices = foodServices;
    this.drinkServices = drinkServices;
    this.attilaServices = attilaServices;
  }

  @PostMapping("/attilaclub/nutrition")
  public String setNutrition(String food, String drink, String name) {
    Attila attila = attilaServices.find(name);
    attila.setFood(food);
    attila.setDrink(drink);
    return "redirect:/attilaclub?name=" + name;
  }

  @PostMapping("/attilaclub/tricks")
  public String setTricks(String trick, String name) {
    Attila attila = attilaServices.find(name);
    attila.addTrick(trick);
    return "redirect:/attilaclub?name=" + name;
  }
}
