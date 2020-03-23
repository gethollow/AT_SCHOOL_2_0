package tClass;

import HW3.EmployeeCard;


public class tEmployeeCard{
    private static boolean intToBoolean(int input) {
        if((input==0)||(input==1)) {
            return input!=0;
        }else {
            throw new IllegalArgumentException("Входное значение может быть равно только 0 или 1 !");
        }
    }
    public static void testEmployeeCard(){

        for (int i = 1; i < 5 ; i++){
            String name = "Fedor" + i;
            int age = 30 + i ;
            double salary = 15.0 + i;
            double effective = 40.0 + i;
            boolean isWoman = intToBoolean(i % 2);
            EmployeeCard cardi = new EmployeeCard(name,effective,salary,isWoman);
            System.out.println(cardi.toString());
        }

        //EmployeeCard card1 = new EmployeeCard("Vasya", 30, 60.0, true);
        //EmployeeCard card2 = new EmployeeCard()
        //System.out.println(card1.toString());
    }
}
