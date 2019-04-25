package CowsAndBulls;

import java.util.Scanner;

public class Guess {

    private int CAB;
    private Scanner scanner;

    public Guess(){
        CAB = 1000 + (int)(Math.random() * ((9999 - 1000) + 1));
    }
}
