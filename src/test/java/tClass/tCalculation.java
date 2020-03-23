package tClass;

import HW3.Calculation;

import java.io.*;
import java.util.Scanner;


public class tCalculation {
    private static double value= 0.1;
    private static int ticketPrice = 90;
    private static String Str;
    private static double percent = 100.0;

    public static void testCalculation() throws IOException {
        Calculation.discount(value);
        //__________________________________________________
        if (value<15){
        File file = new File("src\\test\\java\\tClass\\file.txt");
        PrintStream out = System.out;
        PrintStream ps = null;
        try {
            ps = new PrintStream(file.getAbsoluteFile());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(ps);
        Calculation.discount(value);
        System.setOut(out);
        //_________________________________________________
        FileReader fr = new FileReader(file.getAbsoluteFile());
        Scanner scan = new Scanner(fr);
        while (scan.hasNextLine()){
            Str = scan.nextLine();
        }
        fr.close();
        //____________________________________________________
        Str = Str.replace("Скидка составляет - ","");
        Str = Str.replace("%","");
        Double discount = Double.parseDouble(Str);
            System.out.println((ticketPrice/percent)*discount);
        System.out.println(Calculation.countTicketPrice(ticketPrice,(ticketPrice/percent)*discount));
        }
        else System.out.println(Calculation.countTicketPrice(ticketPrice,0));
    }
}
