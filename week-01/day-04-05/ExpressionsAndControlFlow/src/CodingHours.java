public class CodingHours {

    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long

        int dailyCoding = 6;
        int semesterWeeks = 17;

        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.

        int semesterCoding = ((dailyCoding * 5) * semesterWeeks);

        System.out.println(semesterCoding);

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int aveWeeklyWorking = 52;
        int semesterWorking = (aveWeeklyWorking * semesterWeeks);

        int percentage = (semesterCoding * 100) / semesterWorking;

        System.out.println("The percentage of coding hours: " + percentage + "%");
    }

}
