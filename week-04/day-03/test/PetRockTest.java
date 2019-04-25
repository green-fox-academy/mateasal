import org.junit.*;

import static org.junit.Assert.*;

public class PetRockTest {

    @BeforeClass
    public static void before() {
        System.out.println("before class");
    }

    @AfterClass
    public static void after() {
        System.out.println("after class");
    }

    @Test
    public void bark() {
        System.out.println("executed");
        PetRock rocky = new PetRock("rocky");
        assertEquals("rocky", rocky.getName());
    }
}