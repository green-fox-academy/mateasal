package com.example.todo.controller;

import com.example.todo.repository.ITodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

  ITodoRepository todoRepository;

  public TodoController(ITodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping("/")
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }

  @GetMapping("/todo")
  public String renderIndex() {
    return "index";
  }
}