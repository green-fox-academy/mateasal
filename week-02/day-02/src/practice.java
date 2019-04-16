import java.util.Arrays;

public class practice {

    public static void main(String[] args) {

        String s = "wordfsdfsdffsd";
        String s1 = "termkl";

        System.out.println(s.toUpperCase());

        if(s1.endsWith("word")){
            System.out.println("starts with word");
        }

        if(s.equalsIgnoreCase(s1)){
            System.out.println("akakakakakakkatkaakk");
        }

        System.out.println(s.concat(s1));

        System.out.println(s.charAt(3));

        System.out.println(s.indexOf("w"));

        System.out.println(s.substring(3, 6));

        System.out.println(s.replace("ord", "po"));

        System.out.println("-------------------------");

        System.out.println(s1.compareTo(s));

        System.out.println(Arrays.toString(s.split("d")));
    }
}
