package com.example.hellobeanworld;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
  ArrayList<String> names;

  public StudentService() {
    names = new ArrayList<>();
    names.add("Sanyi");
    names.add("Lilla");
    names.add("John");
  }

  public List<String> findAll() {
    return names;
  }

  public void save(String student) {
    names.add(student);
  }

  public int count() {
    return this.names.size();
  }

  public boolean search(String result) {
    int appears = 0;
    for (String name : names) {
      if (name.contains(result)) {
        appears++;
      }
    }
    return appears > 0;
  }
}