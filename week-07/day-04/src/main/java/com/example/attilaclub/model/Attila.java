package com.example.attilaclub.model;

import java.util.Arrays;
import java.util.List;

public class Attila {
  String name;
  List<String> listOfTricks;
  String food = "salad";
  String drink = "water";

  public Attila(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public List<String> getListOfTricks() {
    return listOfTricks;
  }

  public boolean checkTrickList() {
    if (listOfTricks == null) {
      return true;
    } else return false;
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