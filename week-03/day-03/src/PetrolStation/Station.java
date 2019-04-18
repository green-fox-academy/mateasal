package PetrolStation;

import PetrolStation.Car;

public class Station {

    public Station(int gasAmount){
        this.gasAmount = gasAmount;
    }

    int gasAmount;

    public void refill(Car car){
        gasAmount -= car.capacity;
        car.gasAmount += car.capacity;
    }
}
