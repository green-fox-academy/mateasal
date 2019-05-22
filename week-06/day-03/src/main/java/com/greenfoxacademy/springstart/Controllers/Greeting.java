package com.greenfoxacademy.springstart.Controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  AtomicLong id;
  String contents;

  public Greeting(AtomicLong id, String contents) {
    this.id = id;
    this.contents = "Hello " + contents;
  }

  public AtomicLong getId() {
    return id;
  }

  public String getContents() {
    return contents;
  }
}
