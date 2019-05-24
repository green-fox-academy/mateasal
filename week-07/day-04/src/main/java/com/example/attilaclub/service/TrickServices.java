package com.example.attilaclub.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrickServices {
  ArrayList<String> tricks;

  public TrickServices() {
    tricks = new ArrayList<>();
    tricks.add("Tell Dad Jokes");
    tricks.add("Do the Mumbo Jumbo");
    tricks.add("Complain about Spring");
    tricks.add("Pick up Chicks");
    tricks.add("Float his Boat");
    tricks.add("Gányolás");
    tricks.add("Say the Sickest Burns");
    tricks.add("Drop the Mic");
    tricks.add("Ruin Pool Forever");
    tricks.add("Pick his Nose");
    tricks.add("Revolutionize Sport Scoring");
  }

  public List<String> findAll() {
    return tricks;
  }
}