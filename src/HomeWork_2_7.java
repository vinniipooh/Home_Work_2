/**
 * Created by Александр on 18.03.2017.
 */

import java.util.Scanner;

public class HomeWork_2_7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трёхзначное чило");
        int x = sc.nextInt();

        if (x > 99 && x < 1000) {
        int a = x / 100;
        int b = x / 10 % 10;
        int c = x % 100 % 10;

        System.out.println("Ваше число: " + a + b + c);

        char comparison1 = (a > c) ? '>' : '<';
        char comparison2 = (a > b) ? '>' : '<';
        char comparison3 = (b > c) ? '>' : '<';
//В следующей строке я вставил "" потому что без них неправильно выполнялась программа, по непонятным мне причинам.
        System.out.println(a+ "" + comparison1 + c + "\n" + a + comparison2 + b + "\n" + b + comparison3 + c);
        } else System.out.println("Вы ввели неверное число");
    }
}
