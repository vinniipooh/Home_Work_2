/**
 * Created by Александр on 18.03.2017.
 */

import java.util.Scanner;

public class HomeWork_2_6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double GrnPerMinute = 1.5;

        System.out.println("Вычисление стоимости разговора по телефону.");
        System.out.println("Введите количество минут разговора:");
        double min = sc.nextDouble();

        System.out.println("Введите номер дня недели(1-7):");
        double week = sc.nextDouble();

        double diskont = (week == 6) ? 0.8 : 1;

        double price = GrnPerMinute * min * diskont;

        System.out.println("Стоимость разговора по телефону: " + price + " гривен");
    }
}
