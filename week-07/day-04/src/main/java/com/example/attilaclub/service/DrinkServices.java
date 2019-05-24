package com.example.attilaclub.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DrinkServices {
  ArrayList<String> drinks;

  public DrinkServices() {
    drinks = new ArrayList<>();
    drinks.add("Arany Ászok");
    drinks.add("Balatoni Világos");
    drinks.add("Borsodi Bivaly");
    drinks.add("Borsodi Búza");
    drinks.add("Borsodi Jeges");
    drinks.add("Borsodi Mester");
    drinks.add("Borsodi Nitro");
    drinks.add("Borsodi Super Dry");
    drinks.add("Borsodi Tüzes");
    drinks.add("Borsodi Világos");
    drinks.add("Dreher Bak");
    drinks.add("Dreher Gold");
    drinks.add("Kőbányai Sör");
    drinks.add("Rákóczi sör");
    drinks.add("Soproni");
    drinks.add("Soproni 1895");
    drinks.add("Soproni Fekete Démon");
    drinks.add("Szalon Barna");
    drinks.add("Szalon sör");
  }

  public List<String> findAll() {
    return drinks;
  }
}