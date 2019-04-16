import java.util.HashMap;

public class MapIntro {

    public static void main(String[] args) {

        HashMap<Integer, Character> myMap = new HashMap<>();

        System.out.println(myMap.isEmpty());

        myMap.put(97, 'a');
        myMap.put(98, 'b');
        myMap.put(99, 'c');
        myMap.put(65, 'A');
        myMap.put(66, 'B');
        myMap.put(67, 'C');

        System.out.println(myMap.keySet());

        System.out.println("---------------");

        for (Integer key : myMap.keySet()){
            String kk = key.toString();
            String value = myMap.get(key).toString();
            System.out.println(kk+ " - " +value);
        }

        System.out.println("---------------");

        myMap.put(68, 'D');

        System.out.println(myMap.size());

        System.out.println("---------------");

        System.out.println(myMap.get(99));

        System.out.println("---------------");

        myMap.remove(97);

        int counter = 0;

        for (Integer key : myMap.keySet()) {
            if (key == 100) {
                counter++;
            }
        }
        if (counter > 0){
            System.out.println("There is a 100!");
        } else {
            System.out.println("No 100! :(");
        }

        myMap.clear();

        System.out.println(myMap.size());
    }
}