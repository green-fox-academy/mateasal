package com.example.attilaclub.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodServices {
  ArrayList<String> foods;

  public FoodServices() {
    foods = new ArrayList<>();
    foods.add("canned beans");
    foods.add("one boiled egg");
    foods.add("chicken");
    foods.add("rice");
    foods.add("a slice of bread");
    foods.add("some mayo");
    foods.add("Technokol Rapid");
    foods.add("chewing gum");
    foods.add("Arany Ászok");
    foods.add("Túró Rudi");
    foods.add("palacsinta");
    foods.add("fish soup");
  }

  public List<String> findAll() {
    return foods;
  }

  public void save(String student) {
    foods.add(student);
  }
}