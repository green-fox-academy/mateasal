import java.util.HashMap;

public class mapIntroduction {

    public static void main(String[] args) {


        HashMap<String, String> books = new HashMap<>();

        books.put("978-1-60309-452-8", "A Letter to Jo");
        books.put("978-1-60309-459-7", "Lupus");
        books.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        books.put("978-1-60309-461-0", "The Lab");

        for (String code : books.keySet()){
            String titles = books.get(code);
            System.out.println(titles + " (ISBN: " + code + ')');
        }

        System.out.println("-------------------");

        books.remove("978-1-60309-444-3");

        books.values().remove("The Lab");

        System.out.println(books);

        System.out.println("-------------------");

        books.put("978-1-60309-450-4", "They Called Us Enemy");
        books.put("978-1-60309-453-5", "Why Did We Trust Him?");

        int i = 0;
        for (String code : books.keySet()){
            if (code == "478-0-61159-424-8"){
             i ++;
            }
        }
        if (i>0){
            System.out.println("Bingo!");
        } else {
            System.out.println("No luck!");
        }

        System.out.println("-------------------");

        for (String code : books.keySet()){
            if (code == "978-1-60309-453-5"){
                System.out.println(books.get(code));
            }
        }
    }
}
