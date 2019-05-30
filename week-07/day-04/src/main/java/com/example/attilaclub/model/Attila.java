package com.example.attilaclub.model;

import java.util.ArrayList;
import java.util.List;

public class Attila {
  String name;
  List<String> listOfTricks = new ArrayList<>();
  String food = "salad";
  String drink = "water";

  public Attila(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void addTrick(String trick) {
    listOfTricks.add(trick);
  }

  public List<String> getListOfTricks() {
    return listOfTricks;
  }

  public boolean checkTrickList() {
    if (listOfTricks.size() == 0) {
      return true;
    }
    return false;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}