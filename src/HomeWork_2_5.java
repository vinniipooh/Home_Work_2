/**
 * Created by Александр on 18.03.2017.
 */

import java.util.Scanner;

public class HomeWork_2_5 {
    public static void main(String args[]) {

        //Проверяем делиться ли число на 3

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число:");
        double x = sc.nextDouble();

        String test = (x % 3 == 0) ? "делиться" : "не делиться";
        System.out.println("Число " + x + " " + test + " на 3");
    }
}
