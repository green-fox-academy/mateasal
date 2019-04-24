package main.java.animals;

import FlyingAround.Flyable;

public class Bird extends Animal implements Flyable {

    public Bird(String name){
        this.name = name;
    }
    public String breed(){
        return "laying eggs";
    }

    public void land(){
    }

    public void fly(){
    }

    public void takeOff(){
    }
}
