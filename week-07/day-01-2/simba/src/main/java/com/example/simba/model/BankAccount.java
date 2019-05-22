package com.example.simba.model;

public class BankAccount {

  String name;
  int balance;
  String animalType;
  boolean royalty;
  boolean morality;

  public BankAccount(String name, int balance, String animalType, boolean royalty, boolean morality) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.royalty = royalty;
    this.morality = morality;
  }

  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public boolean isRoyalty() {
    return royalty;
  }

  public boolean isMorality() {
    return morality;
  }
}
