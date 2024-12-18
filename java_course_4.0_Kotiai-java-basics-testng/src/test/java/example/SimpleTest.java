package example;

import org.testng.annotations.*;

public class SimpleTest {

    @BeforeMethod
    public void setup() {
        System.out.println("setup");
    }

    @AfterMethod
    public void teardown() {
        System.out.println("teardown");
    }

    @Test
    public void sampleTest() {
        System.out.println("Running sampleTest");
    }
}
