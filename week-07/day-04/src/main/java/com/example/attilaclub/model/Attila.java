package com.example.attilaclub.model;

import java.util.List;

public class Attila {
  String name;
  List<String> listOfTricks;
  String food;
  String drink;

  public Attila(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}