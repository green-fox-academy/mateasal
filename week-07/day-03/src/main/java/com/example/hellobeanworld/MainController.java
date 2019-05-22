package com.example.hellobeanworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  private UtilityService utilityService;

  public  MainController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @RequestMapping(path = "/useful/colored", method = RequestMethod.GET)
  public String Index(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "index";
  }

  @RequestMapping(path= "/useful/email", method = RequestMethod.GET)
  public String Email(Model model) {

  }
}