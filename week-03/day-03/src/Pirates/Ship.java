package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    private static int MAX_CREW = 125;
    private static int MIN_CREW = 15;

    private List<Pirate> crew;
    private Pirate Captain = new Pirate();
    private int piratesAlive = 0;
    private int numberOfPirates;
    private int crewScore = piratesAlive - Captain.getNumberOfRumsHad();

    public void fillShip() {
        crew = new ArrayList<>();
        numberOfPirates = MIN_CREW + (int) (Math.random() * ((MAX_CREW - MIN_CREW) + 1));

        crew.add(Captain);

        for (int i = 0; i < numberOfPirates; i++) {
            crew.add(new Pirate());
        }
    }

    public boolean battle(Ship otherCrew) {
        return this.crewScore > otherCrew.crewScore;
    }

    public void captainInfo() {
        System.out.println("The Captain had " + Captain.getNumberOfRumsHad() + " rum/s.");

        if (Captain.isAlive() && !Captain.isAsleep()) {
            System.out.println("The Captain is alive and awake.");
        } else if (Captain.isAlive() && Captain.isAsleep()) {
            System.out.println("The Captain is alive but asleep.");
        } else {
            System.out.println("The Captain is dead.");
        }
    }

    public void piratesAlive(){
        piratesAlive = 0;
        for (int i = 0; i < crew.size(); i++){
            if (crew.get(i).alive){
                piratesAlive++;
            }
        }
        System.out.println("Number of pirates alive: ");
    }

    public int getCrewSize() {
        return numberOfPirates + 1;
    }
}
