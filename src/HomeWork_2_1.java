/**
 * Created by Александр on 18.03.2017.
 */

import java.util.Scanner;

public class HomeWork_2_1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Эта программа вычесляет частное двух чисел.");
        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double b = scanner.nextDouble();

        if (a != 0 && b != 0) {
            double c = a / b;
            System.out.println("Частное этих чисел равно: " + c);
        } else System.out.println("Ошибка выберите другие числа");
    }
}
