package com.example.workshop1.model;

public class Doubling {

  private int received;
  private int result;

  public Doubling() {
  }

  public Doubling(int received) {
    this.received = received;
    this.result = received * 2;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
