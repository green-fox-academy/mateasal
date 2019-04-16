import java.util.ArrayList;
import java.util.Collections;

public class ListIntroduction2 {

    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>();

        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        ArrayList<String> listB = new ArrayList<>();

        listB.addAll(listA);

        System.out.println(listB);

        if (listA.contains("Durian")){
            System.out.println("Contains Durian!");
        } else {
            System.out.println("Doesn't contain Durian!");
        }

        listB.remove("Durian");
        System.out.println(listB);

        listA.add(4,"Kiwifruit");
        System.out.println(listA);

        if (listA.size() > listB.size()){
            System.out.println("List A is longer!");
        } else if (listA.size() < listB.size()){
            System.out.println("List B is longer!");
        } else {
            System.out.println("List A and B are equally long!");
        }

        System.out.println("----------------------");

        System.out.println(listA.indexOf("Avocado"));

        System.out.println(listB.indexOf("Durian"));

        Collections.addAll(listB, "Passion Fruit", "Pumelo");

        System.out.println(listB);

        System.out.println(listB.get(2));

    }
}
