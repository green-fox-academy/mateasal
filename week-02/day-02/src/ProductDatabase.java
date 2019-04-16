import java.util.HashMap;

public class ProductDatabase {
    public static void main(String[] args) {

        HashMap<String, Integer> list = new HashMap<>();

        list.put("Eggs", 200);
        list.put("Milk", 200);
        list.put("Fish", 400);
        list.put("Apples", 150);
        list.put("Bread", 50);
        list.put("Chicken", 550);

        for (String item : list.keySet()){
            int price = list.get(item);
            System.out.println(item + "  " + price);
        }

        System.out.println("---------");
        System.out.println("How much is the fish?");

        for (String item : list. keySet()){
            if (item == "Fish"){
                System.out.println("The fish is " + list.get(item));
            }
        }

        System.out.println("---------");
        System.out.println("What is the most expensive product?");

        int mostExpensive = 0;

        for (String item: list.keySet()){
            if (list.get(item) > mostExpensive){
                mostExpensive = list.get(item);
            }
        }

        int id = mostExpensive;

        for (String item : list.keySet()){
            if (list.get(item) == id){
                System.out.println(item);
            }
        }

        System.out.println("---------");
        System.out.println("What is the average price?");

        int sum = 0;

        for (String item : list.keySet()){
            sum = sum + list.get(item);
        }

        int average = sum / list.size();
        System.out.println(average);

        System.out.println("---------");
        System.out.println("How many products' price is below 300?");

        int counter = 0;
        for (String item : list.keySet()){
            if (list.get(item) < 300){
                counter++;
            }
        }
        System.out.println(counter);

        System.out.println("---------");
        System.out.println("Is there anything we can buy for exactly 125?");

        int quiteCheap = 0;
        for (String item : list.keySet()){
            if (list.get(item) == 125){
                quiteCheap++;
            }
        }
        if (quiteCheap > 0){
            System.out.println("Yes, we can!");
        } else {
            System.out.println("No, we can't!");
        }

        System.out.println("---------");
        System.out.println("What is the cheapest product?");

        String minKey = null;
        int minValue = mostExpensive;
        for (String element : list.keySet()){
            int value = list.get(element);
            if (value < minValue) {
                minValue = value;
                minKey = element;
            }
        }

        System.out.println(minKey);

    }
}
