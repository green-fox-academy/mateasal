package com.example.todo;

import com.example.todo.model.Todo;
import com.example.todo.repository.ITodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

  ITodoRepository todoRepository;

  public TodoApplication(ITodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Todo todo = new Todo("Eat pizza");
    todoRepository.save(todo);
  }
}
