package com.example.dbpractice.controller;

import com.example.dbpractice.service.ITopicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  private ITopicService topicService;

  public HomeController(ITopicService topicService) {
    this.topicService = topicService;
  }

  @GetMapping("/index")
  public String renderIndex(Model model) {
    model.addAttribute("topics", topicService.findAll());
    return "index";
  }
}
