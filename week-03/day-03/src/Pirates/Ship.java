package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    private static int MAX_CREW = 125;
    private static int MIN_CREW = 15;

    private static List<Pirate> crew;
    private static Pirate Captain;

    private int numberOfPirates;

    public Ship(){
        int crewSize = numberOfPirates + 1;
    }

    public void fillShip(){
        crew = new ArrayList<>();
        numberOfPirates = MIN_CREW + (int)(Math.random() * ((MAX_CREW - MIN_CREW) + 1));

        for (int i = 0; i < numberOfPirates; i++){
            crew.add(new Pirate());
        }
        crew.add(Captain);
    }

    public int getNumberOfPirates() {
        return numberOfPirates;
    }
}
