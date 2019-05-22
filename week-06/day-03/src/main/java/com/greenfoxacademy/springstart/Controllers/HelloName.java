package com.greenfoxacademy.springstart.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloName {

  AtomicLong counter = new AtomicLong(0);

  @RequestMapping(value = "/greeting")

  public String greeting(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    model.addAttribute("visits", new AtomicLong(counter.incrementAndGet()));
    return "webgreeting";
  }
}