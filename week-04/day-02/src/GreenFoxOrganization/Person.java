package GreenFoxOrganization;

public class Person {

    private String name;
    private int age;
    private String gender;
    private String goal;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.goal = "Live for the moment!";
    }

    public Person(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.goal = "Live for the moment!";
    }

    public void introduce() {
        System.out.println("Hi, I'm " + getName() + " a " + getAge() + " year old " + getGender());
    }

    public void getGoal() {
        System.out.println("My goal is: ");
        System.out.println(goal);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}