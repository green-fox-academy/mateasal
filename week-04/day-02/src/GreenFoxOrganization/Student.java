package GreenFoxOrganization;

public class Student extends Person implements Cloneable {

    private String previousOrganization;
    private int skippedDays;
    private String goal;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.goal = "Become a junior software developer.";
        this.skippedDays = 0;
    }

    public Student() {
        super();
        this.previousOrganization = "The School of Life";
        this.goal = "Become a junior software developer.";
        this.skippedDays = 0;
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }


    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: ");
        System.out.println(goal);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println(" from " + previousOrganization + " who skipped " + skippedDays
                + " days from the course already.");
    }

    public void setPreviousOrganization(String previousOrganization) {
        this.previousOrganization = previousOrganization;
    }

    public void setSkippedDays(int skippedDays) {
        this.skippedDays = skippedDays;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
}