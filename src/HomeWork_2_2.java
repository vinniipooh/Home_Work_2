/**
 * Created by Александр on 18.03.2017.
 */

import java.util.Scanner;

public class HomeWork_2_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("В каком году была основана Одесса?");
        double a = sc.nextDouble();

        String test = (a == 1794) ? "Вы правы" : "Не правильно";
        System.out.print(test);
    }
}
