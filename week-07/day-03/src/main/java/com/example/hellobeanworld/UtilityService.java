package com.example.hellobeanworld;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
  ArrayList<String> colors;
  Random random;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String validateEmail(String email) {
    if (email.contains("@") && email.contains(".")) {
      return email + " is a valid email address.";
    } else {
      return email + " is not a valid email address";
    }
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public String Ceasar(String text, Integer number) {
    if (text == null || number == 0) {
      return "haliho";
    } else {
      if (number < 0) {
        number = 26 + number;
      }

      String result = "";
      for(int i = 0; i < text.length(); i++) {
        int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
        result += (char)(((int)text.charAt(i) + number - offset) % 26 + offset);
      }
      return result;
    }
    }
}