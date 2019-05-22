package com.greenfoxacademy.springstart.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloLanguages {

  AtomicLong counter = new AtomicLong(0);

  @RequestMapping(value = "/greetings")

  public String greeting(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    model.addAttribute("visits", new AtomicLong(counter.incrementAndGet()));
    model.addAttribute("greeting", giveRandomGreeting());
    model.addAttribute("fontsize", "color: rgb(" + randomGenerator() + ", "
            + randomGenerator() + ", "
            + randomGenerator() + ") ;font-size:" + randomGenerator() + "px");
    return "greetings";
  }

  private String giveRandomGreeting() {
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj",
            "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Kenőcs", "Guten Tag",
            "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló",
            "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit", "Salve", "Ciao", "Kon-nichiwa",
            "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte",
            "Hola", "Jambo", "Hujambo", "Hej", "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào",
            "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    int random = (int) (Math.random() * hellos.length + 1);

    return hellos[random];
  }

  private int randomGenerator() {
    int random = (int) (Math.random() * 255 + 1);
    return random;
  }

}