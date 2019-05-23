package com.example.attilaclub.service;

import com.example.attilaclub.model.Attila;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AttilaServices {
  List<Attila> attilas;

  public AttilaServices() {
    attilas = new ArrayList<>();
  }

  public void save(Attila attila) {
    attilas.add(attila);
  }

  public boolean search(String name) {
    for (Attila attila : attilas) {
      if (name.equals(attila.getName())) {
        return true;
      }
    }
    return false;
  }

  public Attila find(String name) {
    for (Attila attila : attilas) {
      if (name.equals(attila.getName())) {
        return attila;
      }
    }
    return new Attila(name);
  }

  public List<Attila> getAttilas() {
    return attilas;
  }
}