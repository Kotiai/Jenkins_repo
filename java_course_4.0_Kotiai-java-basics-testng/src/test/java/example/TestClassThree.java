package example;

import org.apache.commons.math3.util.ArithmeticUtils;
import org.testng.annotations.Test;

public class TestClassThree {

    @Test(priority = 3)
    public void testPower() {
        double result = Math.pow(2, 3);
        System.out.println("Power result: " + result);
    }

    @Test(priority = 2)
    public void testFactorial() {
        long result = ArithmeticUtils.factorial(5);
        System.out.println("Factorial result: " + result);
    }

    @Test(priority = 1)
    public void testGCD() {
        // test Greatest Common Divisor
        int gcd = ArithmeticUtils.gcd(48, 18);
        System.out.println("GCD result: " + gcd);
    }
}

