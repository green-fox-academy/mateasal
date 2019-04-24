package GreenFoxOrganization;

public class Sponsor extends Person {

    private String company;
    private int hiredStudents;
    private String goal;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.hiredStudents = 0;
        this.company = company;
        this.goal = "Hire brilliant junior software developers.";
    }

    public Sponsor() {
        super();
        this.hiredStudents = 0;
        this.company = "Google";
        this.goal = "Hire brilliant junior software developers.";
    }

    public void hire(){
        hiredStudents++;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("who represents" + company + "and hired" + hiredStudents + "students so far.");
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: ");
        System.out.println(goal);
    }
}
