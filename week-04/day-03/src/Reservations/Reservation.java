package Reservations;

import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Reservation implements Reservationy {

    public RandomString getCodeBooking() {
        RandomString gen = new RandomString(8, ThreadLocalRandom.current());
        return gen;
    }

    public String getDowBooking() {
        String[] days = {"MON", "TUES", "WED", "TUES", "FRI", "SAT", "SUN"};
        int randomNumber = 0 + (int)(Math.random() * ((6 - 0) + 1));
        String dowBooking = days[randomNumber];
        return dowBooking;
    }
}