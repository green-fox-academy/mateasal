package com.example.workshop1.model;

public class Factorer {

  private int until;
  private int result;

  public Factorer() {
  }

  public Factorer(int until) {
    this.until = until;
    this.result = factoring(until);
  }

  private int factoring(int until) {
    int sum = 1;
    for (int i = 1; i <= until; i++) {
      sum = sum * i;
    }
    return sum;
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}