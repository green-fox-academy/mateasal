package com.example.dbpractice.controller;

import com.example.dbpractice.model.Topic;
import com.example.dbpractice.service.ITopicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TopicController {

  private ITopicService topicService;

  public TopicController(ITopicService topicService) {
    this.topicService = topicService;
  }

  @GetMapping("/createTopic")
  public String renderCreateTopicPage(Model model) {
    model.addAttribute("topic", new Topic());
    return "createTopic";
  }

  @PostMapping("/createTopic")
  public String createTopic(Topic topic) {
    topicService.save(topic);
    return "redirect:/index";
  }

  @PostMapping("/delete")
  public String deleteTopic(@RequestParam Long id) {
    topicService.delete(id);
    return "redirect:/index";
  }
}
