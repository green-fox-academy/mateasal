import java.util.Collections;
import java.util.HashMap;

public class TelephoneBook {

    public static void main(String[] args) {

        HashMap<String, String> phonebook = new HashMap<>();

        phonebook.put("William A. Lathan", "405-709-1865");
        phonebook.put("John K. Miller", "402-247-8568");
        phonebook.put("Hortensia E. Foster", "606-481-6467");
        phonebook.put("Amanda D. Newland", "319-243-5613");
        phonebook.put("Brooke P. Askew", "307-687-2982");

        for(String name : phonebook.keySet()){
            String number = phonebook.get(name);
            System.out.println(name + "   " + number);
        }

        System.out.println("-----------------------");
        System.out.println("What is John K. Miller's phone number?");


        for (String name : phonebook.keySet()){
            if (name == "John K. Miller"){
                System.out.println(phonebook.get(name));
            }
        }
        System.out.println("-----------------------");
        System.out.println("Whose phone number is 307-687-2982?");

        for (String name : phonebook.keySet()){
            if (phonebook.get(name) == "307-687-2982"){
                System.out.println(name);
            }
        }

        System.out.println("-----------------------");
        System.out.println("Do we know Chris E. Myers' phone number?");

        int myers = 0;
        for (String name : phonebook.keySet()){
            if (name == "Chris E. Myers"){
                myers++;
            }
        }
        if (myers > 0){
            System.out.println("Yes!");
        } else {
            System.out.println("No :(");
        }

        System.out.println("-----------------------");
    }
}
