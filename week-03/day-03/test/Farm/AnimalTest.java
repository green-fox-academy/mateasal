package Farm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    Animal animal;

    @Before
    public void setup() {
        animal = new Animal();
    }

    @Test
    public void eat() {
        animal.eat();
        assertEquals(49, animal.hunger);
    }

    @Test
    public void drink() {
        animal.drink();
        assertEquals(49, animal.thirst);
    }

    @Test
    public void play() {
        animal.play();
        assertEquals(51, animal.thirst);
        assertEquals(51, animal.hunger);
    }
}