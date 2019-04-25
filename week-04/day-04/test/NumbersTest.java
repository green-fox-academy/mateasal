import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class NumbersTest {

    Numbers listOfNumbers;

    @Before
    public void setup(){
        listOfNumbers = new Numbers();
    }

    @Test
    public void sum() {
        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        assertEquals(15, listOfNumbers.sum(testList));
    }

    @Test
    public void sumIfEmpty() {
        List<Integer> testList = new ArrayList<>();
        assertEquals(0, listOfNumbers.sum(testList));
    }

    @Test
    public void sumWithOne() {
        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        assertEquals(1, listOfNumbers.sum(testList));
    }

    @Test
    public void sumWithMultiple() {
        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        assertEquals(6, listOfNumbers.sum(testList));
    }

    @Test (expected = NullPointerException.class)
    public void sumWithNull() {
        List<Integer> testList = new ArrayList<>();
        testList.add(null);
        assertEquals(null, listOfNumbers.sum(testList));
    }
}