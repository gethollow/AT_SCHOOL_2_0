package tClass;

import HW3.EmployeeCard;
import HW3.IndividualWork;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class tIndividualWork {
    @Test
    public static void testIndividualWork() throws IOException {
        IndividualWork obj = new IndividualWork();
        obj.table();

        testBus(20,"Ленина");
        testBus(7.5,"Комсомольская");
        testBus(0,"Автобус стоит на автовокзале");
        testBus(36.6,"Автобус стоит на автовокзале");
        testBus(15.1,"Тимирязевская");
    }

    private static void testBus(double time, String expect_res) throws IOException {
        String actual_res = new IndividualWork().busStation(time);
        Assert.assertEquals(actual_res,expect_res,"Если фактический результат отличется от ожидаемого");
        System.out.println(expect_res);

    }
}
