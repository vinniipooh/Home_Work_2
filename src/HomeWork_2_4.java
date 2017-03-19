/**
 * Created by Александр on 18.03.2017.
 */

import java.util.Scanner;

public class HomeWork_2_4 {
    public static void main(String args[]) {

        //Проверяем чётное или нечётное число

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число:");
        double x = sc.nextDouble();

        String test = (x % 2 == 0) ? "Чётное" : "Нечётное";
        System.out.println("Число " + x + " - " + test);
    }
}
