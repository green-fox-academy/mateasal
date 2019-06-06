package com.example.workshop1.model;

public class Result {

  Object result;

  public Result(String what, int[] numbers) {
    if (what.equals("sum")) {
      this.result = summing(numbers);
    } else if (what.equals("multiply")) {
      this.result = multiplying(numbers);
    } else {
      this.result = doubling(numbers);
    }
  }

  private int summing(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum = sum + number;
    }
    return sum;
  }

  private int multiplying(int[] numbers) {
    int multiplied = 1;
    for (int number : numbers) {
      multiplied = multiplied * number;
    }
    return multiplied;
  }

  private int[] doubling(int[] numbers) {
    int[] doubled = new int[numbers.length];
    int counter = 0;
    for (int number : numbers) {
      doubled[counter] = number * 2;
      counter++;
    }
    return doubled;
  }

  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }
}
