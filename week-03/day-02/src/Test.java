import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,2,3,4,5);

        int i =0;
        for (Integer digit : list) {
            i++;
        }
        System.out.println(i );
    }
}