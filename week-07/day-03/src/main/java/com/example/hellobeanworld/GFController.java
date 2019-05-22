package com.example.hellobeanworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GFController {

  private StudentService studentService;

  public GFController(StudentService studentService) {
    this.studentService = studentService;
  }

  @RequestMapping(path = "/gfa", method = RequestMethod.GET)
  public String Greenfox(Model model) {
    model.addAttribute("counter", studentService.count());
    return "gfa";
  }

  @RequestMapping(path = "/gfa/list", method = RequestMethod.GET)
  public String GFList(Model model) {
    model.addAttribute("list", studentService.findAll());
    return "list";
  }

  @RequestMapping(path = "/gfa/check", method = RequestMethod.GET)
  public String nameCheck(Model model) {
    model.addAttribute("list", studentService.findAll());
    return "check";
  }

  @PostMapping("/gfa/add")
  public String handlingAdding(Model model, String name) {
    studentService.save(name);
    model.addAttribute("list", studentService.findAll());
    return "redirect:list";
  }

  @PostMapping("/gfa/search")
  public String nameSearching(Model model, String result) {
    boolean registered = studentService.search(result);
    model.addAttribute("registered", registered);
    return "check";
  }
}