public class SecondsInADay {

    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int allHours = 24;
        int allMinutes = 1440;
        int allSeconds = 86400;

        int remainingHours = allHours - currentHours;
        int remainingMinutes = allMinutes - currentMinutes;
        int remainingSeconds = allSeconds - currentSeconds;

        int remainingTime = ((remainingHours * 60) * 60) + (remainingMinutes * 60) + (remainingSeconds);

        System.out.println("There are only " + remainingTime + " seconds left!");

    }

}
