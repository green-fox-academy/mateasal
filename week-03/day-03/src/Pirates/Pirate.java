package Pirates;

public class Pirate {

    int numberOfRumsHad;
    boolean alive;
    boolean asleep;

    public Pirate(){
        this.numberOfRumsHad = 0;
        this.alive = true;
        this.asleep = false;
    }

    public void drinkSomeRum(){
        if (alive == true){
            numberOfRumsHad++;
        } else {
            System.out.println("He is dead.");
        }
    }

    public void howItGoingMate(){
        if ((numberOfRumsHad >= 0) && (numberOfRumsHad <= 4)){
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            asleep = true;
        }
    }

    public void die(){
        alive = false;
    }

    public void brawl(Pirate anotherPirate){
        int happening = (int)(Math.random() * 3);
        if (happening == 0) {
            alive = false;
        } else if (happening == 1) {
            anotherPirate.alive = false;
        } else {
            asleep = true;
            anotherPirate.asleep = true;
        }
    }

    public int getNumberOfRumsHad() {
        return numberOfRumsHad;
    }

    public boolean isAlive() {
        return alive;
    }

    public boolean isAsleep() {
        return asleep;
    }
}