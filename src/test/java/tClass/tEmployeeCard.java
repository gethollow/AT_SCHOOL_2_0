package tClass;

import HW3.EmployeeCard;
import org.testng.Assert;
import org.testng.annotations.Test;


public class tEmployeeCard{
    private static boolean intToBoolean(int input) {
        if((input==0)||(input==1)) {
            return input!=0;
        }else {
            throw new IllegalArgumentException("Входное значение может быть равно только 0 или 1 !");
        }
    }
    @Test
    public static void testEmployeeCard(){
        for (int i = 1; i < 5 ; i++){
            String name = "Fedor" + i;
            int age = 30 + i ;
            double salary = 15.0 + i;
            double effective = 40.0 + i;
            boolean isWoman = intToBoolean(i % 2);
            testToString(name,age,effective,salary,isWoman);
        }



    }
    private static void testToString(String name,int age, double effective, double salary, boolean isWoman){
        String except_res = "Имя работника - " + name + ". Его возраст - " + age + " лет. Его зарплата - " + salary + " в час. Пол - " + ((isWoman)? "Женский":"Мужской");
        String actual_res = new EmployeeCard(name,age,effective,salary,isWoman).toString();
        Assert.assertEquals(actual_res,except_res,"Если фактический результат отличется от ожидаемого");
        System.out.println(actual_res);

    }
}
