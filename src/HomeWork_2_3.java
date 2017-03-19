/**
 * Created by Александр on 18.03.2017.
 */

import java.util.Scanner;

public class HomeWork_2_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Вычесление стоимости покупки с учётом скидки");
        double x = sc.nextDouble();

        double discont = (x > 500) ? (x > 1000 ? 0.95 : 0.97) : 1;
        x *= discont;
        System.out.print("Сумма с учётом скидки: " + x);
    }
}
