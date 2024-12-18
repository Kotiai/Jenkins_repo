package example;

import org.apache.commons.math3.util.ArithmeticUtils;
import org.testng.annotations.*;

public class TestClassOne {

    @BeforeMethod(groups = {"preconditions"})
    public void setup() {
        System.out.println("Setup before 1st testclass started");
    }

    @AfterMethod(groups = {"cleanup"})
    public void teardown() {
        System.out.println("Teardown after 1st testclass finished");
    }

    @Test(groups = {"group1"})
    public void testAddition() {
        int result = ArithmeticUtils.addAndCheck(5, 10);
        System.out.println("Addition result: " + result);
    }

    @Test(groups = {"group2"}, enabled = false)
    public void testMultiplication() {
        int result = ArithmeticUtils.mulAndCheck(3, 7);
        System.out.println("Multiplication result: " + result);
    }

    @Test(groups = {"group3"})
    public void testCircleArea() {
        double radius = 3.0;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Circle area: " + area);
    }
}
