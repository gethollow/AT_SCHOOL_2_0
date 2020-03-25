package HW3;

import java.io.*;
import java.util.Scanner;

public class Calculation {
    /**
     * Метод рассчета скидки, взависимости от зарпалты в час.
     * Чем больше зарплата - тем меньше скидка
     *
     * @param salary - зарплата
     */
    public static void discount(double salary) {
        if (salary < 5.0) {
            System.out.println("Скидка составляет - 30%");
        } else if (salary < 12.0) {
            System.out.println("Скидка составляет - 20%");
        } else if (salary < 15.0) {
            System.out.println("Скидка составляет - 15%");
        } else System.out.println("Скидки не будет!");
        // Посчитайте скидку с разными параметрами. Выведите корректную скидку на экран.
    }

    /**
     * Метод рассчета стоимости билета со скидкой.
     * Для рассчета скидки, используйте метод discount
     *
     * @param ticketPrice - стоимость билета
     * @param discount    - скидка
     * @return стоимость билета со скидкой
     */
    public static double countTicketPrice(int ticketPrice, double discount) {
        return ticketPrice - discount;
    }

    // Метод должен корректно считать окончательную стоимость билета
    private static String Str;

    public static Double ticketPrice(double valuePrice) throws IOException {
        discount(valuePrice);
        Double discount1 = null;
        if ((valuePrice < 15.0) && (valuePrice > 0.0)) {
            //Создание и запись в файл
            File file = new File("src\\test\\java\\tClass\\file.txt");
            PrintStream out = System.out;
            PrintStream ps = null;
            try {
                ps = new PrintStream(file.getAbsoluteFile());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.setOut(ps);
            discount(valuePrice);
            System.setOut(out);

            //Считывание с файла и запись в переменную Str
            FileReader fr = new FileReader(file.getAbsoluteFile());
            Scanner scan = new Scanner(fr);
            while (scan.hasNextLine()) {
                Str = scan.nextLine();
            }
            fr.close();

            //Удаляем ненужные элементы в строке и переводим её в тип double
            Str = Str.replace("Скидка составляет - ", "");
            Str = Str.replace("%", "");
            discount1 = Double.parseDouble(Str);
            //Выводим стоимость билета в зависимости от скидки
        } else if ((valuePrice < 0.0) || (valuePrice == 0.0) || (valuePrice > 15.0) || (valuePrice == 15.0)) {discount1 = 0.0;}
        return discount1;
    }
}