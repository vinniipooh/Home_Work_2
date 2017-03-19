/**
 * Created by Александр on 19.03.2017.
 */

import java.util.Scanner;

public class HomeWork_2_8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трёхзначное число: ");
        int x = sc.nextInt();

        if (x > 99 && x < 1000) {
            int a = x / 100;
            int b = x / 10 % 10;
            int c = x % 100 % 10;

            double quadr = Math.pow(x, 2);
            double coub = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);

            if (quadr == coub)
                System.out.println("Этого не может быть.");
            else System.out.println("Квадрат этого числа не равен сумме кубов его цифр.");
        } else System.out.println("Вы ввели неверное число");
    }
}
