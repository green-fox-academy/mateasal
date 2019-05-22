package com.example.hellobeanworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  private UtilityService utilityService;

  public  MainController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping(value = "/useful/colored")
  public String Index(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "index";
  }

  @RequestMapping(path = "/useful/email", method = RequestMethod.GET)
  public String Email(Model model, @RequestParam(required = false) String email) {
    boolean color;
    color = !utilityService.validateEmail(email).contains("not");

    System.out.println(email);
    model.addAttribute("text", utilityService.validateEmail(email));
    model.addAttribute("color", color);
    return "emailpage";
  }

  @RequestMapping(path = "/useful/caesar", method = RequestMethod.GET)
  public String Caesar(Model model, @RequestParam(required = false) String text,
                       @RequestParam(required = false) Integer number) {
    String result = utilityService.Ceasar(text, number);
    model.addAttribute("result", result);
    return "caesar";
  }
}