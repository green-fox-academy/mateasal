package com.example.workshop1.model;

public class Summer {

  private int until;
  private int result;

  public Summer() {
  }

  public Summer(int until) {
    this.until = until;
    this.result = summing(until);
  }

  private int summing(int until) {
    int sum = 0;
    for (int i = 0; i <= until; i++) {
      sum = sum + i;
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