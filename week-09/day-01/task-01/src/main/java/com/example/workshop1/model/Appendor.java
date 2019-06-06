package com.example.workshop1.model;

public class Appendor {

  private String appended;

  public Appendor(String appendable) {
    this.appended = appendable + "a";
  }

  public Appendor() {
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
