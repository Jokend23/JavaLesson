package lab_3;

import java.util.Scanner;
import java.lang.Math.*;

public class lab_3_zadanie_4 {
    //@authored Korobko A.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите произвольную высоту: ");

        double h = sc.nextFloat();
        double g = 9.8;
        double result;
        double time = 5;
        double find_h;

        result = (g*Math.pow(time, 2)) / 2;
        System.out.println(result);

//        result = Math.sqrt(h*2/g);
//        System.out.println(result);
    }
}
