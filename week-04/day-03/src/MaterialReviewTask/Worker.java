package MaterialReviewTask;

public class Worker extends Honeybee implements IStingable{

    Sting sting = new Sting();

    public void sting(){}

    public void doWork() {
        System.out.println("Do stuff.");
    }
}
