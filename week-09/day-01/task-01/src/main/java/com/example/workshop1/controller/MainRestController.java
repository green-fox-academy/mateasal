package com.example.workshop1.controller;


import com.example.workshop1.model.*;
import com.example.workshop1.model.Error;
import com.example.workshop1.repository.ILogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

@RestController
public class MainRestController {

  @Autowired
  ILogRepository iLogRepository;

  @GetMapping("/doubling")
  public Object doubleNumber(@RequestParam (required = false) Integer input) {
    Log log = new Log(new Timestamp(System.currentTimeMillis()), "/doubling?input=" + input, "input=" + input);
    iLogRepository.save(log);

    if (input != null) {
      return new Doubling(input);
    }
    return new Error("Please provide an input!");
  }

  @GetMapping("/greeter")
  public Object greetUser(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
    Log log = new Log(new Timestamp(System.currentTimeMillis()), "/greeter?name=" + name + "&title=" + title, name + title);
    iLogRepository.save(log);

    if (name == null && title == null) {
      return new Error("Please provide a name and a title!");
    }
    if (name == null) {
      return new Error("Please provide a name!");
    }
    if (title == null) {
      return new Error("Please provide a title!");
    }
    return new Greeter(name, title);
  }

  @GetMapping("/appenda/{appendable}")
  public Appendor AppendA(@PathVariable String appendable) {
    Log log = new Log(new Timestamp(System.currentTimeMillis()), "/appenda/" + appendable, appendable);
    iLogRepository.save(log);

    return new Appendor(appendable);
  }

  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable(required = false) String action, @RequestBody Until until) {
    Log log = new Log(new Timestamp(System.currentTimeMillis()),
            "/dountil/" + action, "input= " + until.getValue());
    iLogRepository.save(log);

    if (action.equals("sum")) {
      return new Summer(until.getValue());
    } else if (action.equals("factor")) {
      return new Factorer(until.getValue());
    } else {
      return new Error("Please provide a number!");
    }
  }

  @PostMapping("/arrays")
  public Object arrayHandler(@RequestBody AHandler aHandler) {
    Log log = new Log(new Timestamp(System.currentTimeMillis()), "/arrays",
            "input= " + aHandler.getWhat() + aHandler.getNumbers().toString());
    iLogRepository.save(log);

    if (aHandler.getWhat() == null || aHandler.getNumbers() == null) {
      return new Error("Please provide what to do with the numbers!");
    }
    return new Result(aHandler.getWhat(), aHandler.getNumbers());
  }

  @GetMapping("/log")
  public Object getLogs() {
    if (iLogRepository != null) {
      return iLogRepository.findAll();
    }
    return new Error("Empty Log.");
  }
}