package GreenFoxOrganization;

public class Mentor extends Person {

    private String level;
    private String goal;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
        this.goal = "Educate brilliant junior software developers.";
    }

    public Mentor() {
        super();
        this.level = "intermediate";
        this.goal = "Educate brilliant junior software developers.";
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println(level + " mentor.");
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: ");
        System.out.println(goal);
    }
}