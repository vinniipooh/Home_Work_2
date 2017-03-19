/**
 * Created by Александр on 19.03.2017.
 */

import java.util.Scanner;

public class HomeWorl_2_9 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сначала значени x затем значения y");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double save1 = 0, save2 = 0;

        if (x>y) {
            save1 = x;
            x = (x*y)*2;
            save2 = x;
            x = save1;
            y = (x+y)/2;
            x = save2;
            System.out.println("x is: " + x + "and y is: " + y);
        }
        else {
            save1 = y;
            y = (x*y)*2;
            save2 = y;
            y = save1;
            x = (x+y)/2;
            y = save2;
            System.out.println("x is: " + x + "and y is: " + y);
        }
    }
}
