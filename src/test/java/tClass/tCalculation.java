package tClass;

import HW3.Calculation;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.*;



public class tCalculation {


    @Test
    public static void testCalculation() throws IOException {

        testTicketPrice(10.1,100, 80.0);
        testTicketPrice(0,50,50.0);
        testTicketPrice(13,35,29.75);
        testTicketPrice(15,40,40.0);
    }
    private static void testTicketPrice(double value,int ticPrice, double realPrice) throws IOException {
        String actual_res = String.valueOf((Calculation.countTicketPrice(ticPrice,((ticPrice/100.0)*Calculation.ticketPrice(value)))));
        String expect_res = String.valueOf(realPrice);
        Assert.assertEquals(actual_res,expect_res,"Если фактический результат отличется от ожидаемого");
        System.out.println(expect_res);

    }
}
