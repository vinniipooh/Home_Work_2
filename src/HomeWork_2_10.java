/**
 * Created by Александр on 19.03.2017.
 */

import java.util.Scanner;

public class HomeWork_2_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите значение a");
        double a = scanner.nextDouble();
        System.out.println("Выберите значение b");
        double c = scanner.nextDouble();
        double b = 0;
        int x1 = 0;

        double D = Math.pow(b, 2) - (4 * a * c);
        System.out.println(D);
        if (D < 0) {
            double x2 = (-b + Math.sqrt(-D)) / (2 * a);
            double x3 = (-b - Math.sqrt(-D)) / (2 * a);
            System.out.println("Квадратное уравнение не имеет вещественных корней, но имеет комплексные" +
                    "\nx1 = " + x1 + "\nx2 = " + x2 + "i\nx3 = " + x3 + "i");
        } else {
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            double x3 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Дискриминант больше 0, значит квадратное уравнение имеет три корня" +
                    " \nx1 = " + x1 + "\nX2 = " + x2 + "\nx3 = " + x3);


        }
    }
}
