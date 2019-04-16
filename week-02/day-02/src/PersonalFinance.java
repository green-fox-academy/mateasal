import java.util.ArrayList;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args) {


        ArrayList<Integer> spending = new ArrayList<>();

        Collections.addAll(spending, 500, 1000, 1250, 175, 800, 120);

        int sum = 0;

        for (int element : spending){
            sum = sum + element;
        }

        System.out.println(sum);

        System.out.println("----------------------");

        int highest = 0;

        for (int element : spending){
            if (element > highest){
                highest = element;
            }
        }

        System.out.println(highest);

        System.out.println("----------------------");

        int lowest = spending.get(0);

        for (int element : spending){
            lowest = lowest < element ? lowest : element;
        }

        System.out.println(lowest);

        System.out.println("----------------------");

        int average = sum / spending.size();

        System.out.println(average);
    }
}
