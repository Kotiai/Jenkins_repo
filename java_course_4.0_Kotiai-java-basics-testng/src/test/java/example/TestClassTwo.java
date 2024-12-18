package example;

import org.apache.commons.math3.stat.StatUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassTwo {

    @Test
    @Parameters({"meanParam1", "meanParam2"})
    public void testMeanWithXmlParams(@Optional("2.0") double param1, @Optional("4.0") double param2) {
        double[] data = {param1, param2};

        double mean = StatUtils.mean(data);

        System.out.println("Mean of XML parameters: " + mean);
    }

    @Test(dataProvider = "varianceDataProvider")
    public void testVarianceWithDataProvider(double[] data) {
        double variance = StatUtils.variance(data);

        System.out.println("Variance of data: " + variance);
    }

    @DataProvider(name = "varianceDataProvider")
    public Object[][] varianceDataProvider() {
        return new Object[][]{
                {new double[]{1.0, 2.0, 3.0}},
                {new double[]{4.0, 17.0, 6.0}},
                {new double[]{2.0, 5.0, 8.0}}
        };
    }
}

