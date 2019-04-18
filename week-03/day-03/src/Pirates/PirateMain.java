package Pirates;

public class PirateMain {

    public static void main(String[] args) {

        Ship myShip1 = new Ship();

        myShip1.fillShip();

        System.out.println("Crew size of Ship 1: " + myShip1.getCrewSize());

        Ship myShip2 = new Ship();

        myShip2.fillShip();

        System.out.println("Crew size of Ship 3: " + myShip2.getCrewSize());

        Ship myShip3 = new Ship();

        myShip3.fillShip();

        System.out.println("Crew size of Ship 3: " + myShip3.getCrewSize());

        Ship myShip4 = new Ship();

        myShip4.fillShip();

        System.out.println("Crew size of Ship 4: " + myShip4.getCrewSize());

        myShip3.captainInfo();
        myShip3.piratesAlive();
    }
}
