import java.util.ArrayList;
import java.util.Collections;

public class ShoppingList {
    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();

        Collections.addAll(shoppingList, "eggs", "milk", "fish", "apples", "bread", "chicken");

        int milk = 0;
        int banana = 0;

        for (String item : shoppingList){
            if (item == "milk"){
                milk++;
            } else if (item == "banana"){
                banana++;
            }
        }
        if (milk > 0){
            System.out.println("we have milk!");
        } else {
            System.out.println("no milk today!");
        }

        if (banana > 0){
            System.out.println("we have banana!");
        } else {
            System.out.println("no banana!");
        }
    }
}
