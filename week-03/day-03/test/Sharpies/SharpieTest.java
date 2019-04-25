package Sharpies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {

    Sharpie sharpie;

    @Before
    public void set() {
        sharpie = new Sharpie("red", 3F);
    }

    @Test
    public void testGetInkAmount() {
        assertEquals(100F, sharpie.inkAmount,0.0);
    }

    @Test
    public void testUseSharpeDecreaseInkAmount() {
        sharpie.use();
        assertEquals(99, sharpie.inkAmount, 0.01);

    }
}