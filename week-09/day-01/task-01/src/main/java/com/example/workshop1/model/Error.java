package com.example.workshop1.model;

public class Error {

  private String error;

  public Error(String message) {
    this.error = message;
  }

  public Error() {
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
