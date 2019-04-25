import java.util.ArrayList;
import java.util.List;

public class Numbers {

    private List<Integer> listOfNumbers = new ArrayList<>();

    public void setListOfNumbers(List<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public int sum(List<Integer> numberList) {
        Integer sumOfNumbers = 0;
        for (Integer number : numberList){
            sumOfNumbers = sumOfNumbers + number;
        }
        return sumOfNumbers;
    }
}
