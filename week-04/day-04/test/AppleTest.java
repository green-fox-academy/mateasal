import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    Apple apple;

    @Test
    public void getApple() {
        apple = new Apple();
        assertEquals("apple", apple.getApple());
    }
}