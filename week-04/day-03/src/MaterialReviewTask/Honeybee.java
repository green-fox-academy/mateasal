package MaterialReviewTask;

public abstract class Honeybee {
    public double length = 20;
    public double width = 10;

    public void fly() {
        System.out.println("I'm flying.");
    }

    public abstract void sting();

    public abstract void doWork();

}
