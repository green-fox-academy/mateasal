import java.util.HashMap;

public class Workshop {

    public static void main(String[] args) {

        String words = "pickle rick";
        String moreWords = "pickle morty";

        if(moreWords.equals(words)){
            System.out.println("something! ");
        }

        if (words.endsWith("rick")){
            System.out.println("it ends with rick!");
        }

        //HasMaps

        HashMap<String, String> oneHashMap = new HashMap<>();
        oneHashMap.put("Mickey", "Mouse");
        oneHashMap.put("Daisey", "Duck");
        oneHashMap.put("Donald", "Duck");
        oneHashMap.put("Donald", "Trump");

        System.out.println(oneHashMap.get("Daisey"));


    }
}
