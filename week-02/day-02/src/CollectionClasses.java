import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CollectionClasses {

    public static void main(String[] args) {

        ArrayList arrayListOne;

        arrayListOne = new ArrayList();

        ArrayList arrayListTwo = new ArrayList();

        List<String> listOfWords = Arrays.asList("hello", "hola", "hallo");


        arrayListOne.addAll(arrayListTwo);

        String paulYoung = "Paul Young";

        List<String> names = new ArrayList<>();

        names.add("John Smith");
        names.add("Oliver Miller");
        names.add("Hayden Joe");

        names.add(paulYoung);

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        names.set(0, "John Adams");

        System.out.println(names);

        for(String i : names){
            System.out.println(i);
        }

        if(names.contains(paulYoung)){
            System.out.println("Paul's here!");
        }

        if (arrayListTwo.containsAll(arrayListOne)){
            System.out.println("errything is errything");
        }

        names.clear();

        if(names.isEmpty()){
            System.out.println("EMPTAAAY!");
        }

        Object[] moreNames = new Object[4];
        moreNames = arrayListOne.toArray();

        System.out.println(Arrays.toString(moreNames));

        System.out.println(listOfWords);

    }
}
