package HW3;

import java.io.*;
import java.util.Scanner;

public class IndividualWork {

    /**
     * Метод вывода таблицы умножения 10х10
     */
    public void table() {
        int string=0;
        for (int a = 1; a < 11; a++){
            string=string+1;
            int column=0;
            for (int b = 1; b < 11; b++){
                column=column+1;
                System.out.print(string*column+" ");
            }
            System.out.println("");
        }
    }

    // Реализовать метод вывода таблицы умножения 10x10 используя циклы
    // Числа разделять пробелами.

    // Пример вывода:
    // 1 2 3 4 5 6 7 8 9 10
    // 2 4 6 8 10 12 14 16 18 20
    // И т.д.


    /**
     * HARD MODE - ON
     * Метод подсчета нахождение автобуса в определенное время
     *
     * @param time - число, означающее время, прошедшее сначала часа
     * @return string - улица, на которой едет автобус в текущее время
     */
    private void bus(double time) {
        time = Math.round(time * 100.0) / 100.0;
        if (time<60) {
            if ((time > 0 && ((time < 8) || (time == 8))) || (((time < 28) || (time == 28)) && (time > 20))) {
                System.out.println("Комсомольская");
            } else if ((time > 0 && ((time < 11) || (time == 11))) || (((time < 20) || (time == 20)) && (time > 17))) {
                System.out.println("Ленина");
            } else if ((time > 0 && ((time < 17) || (time == 17)))) {
                System.out.println("Тимирязевская");
            } else System.out.println("Автобус стоит на автовокзале");
        }else System.out.println("Введено больше часа");
    }

    public String busStation(double station) throws IOException {
        String Str = null;
        File file = new File("src\\test\\java\\tClass\\BusStation.txt");
        PrintStream out = System.out;
        PrintStream ps = null;
        try {
            ps = new PrintStream(file.getAbsoluteFile());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(ps);
        bus(station);
        System.setOut(out);

        //Считывание с файла и запись в переменную Str
        FileReader fr = new FileReader(file.getAbsoluteFile());
        Scanner scan = new Scanner(fr);
        while (scan.hasNextLine()){
            Str = scan.nextLine();
        }
        fr.close();

        //Удаляем ненужные элементы в строке и переводим её в тип double
        return Str;
    }

//  Автобус едет по маршруту, вначале каждого часа, в течение 8 минут он проезжает улицу "Комсомольская",
//  затем в течение следующих 3-х минут проезжает улицу "Ленина",
//  а потом в течение 3-х минут проезжает улицу "Тимирязевская", далее автобус возвращается на начало маршрута.
//  метод должен принимать в себя число, означающее время, прошедшее сначала часа. Определить, на какой улице едет автобус в переданное время

// Например передали число 16.5. Ответ - Комсомольская
// Число 9 - Ленина

}


