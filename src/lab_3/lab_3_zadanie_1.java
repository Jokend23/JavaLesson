package lab_3;

import java.util.Scanner;

public class lab_3_zadanie_1 {
    //@authored Korobko A.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите степерь двойки: ");
        double n = sc.nextDouble();
        double result = 1;
        double degree = 2;

        if (n > 0) {
            for (var i = 0; i < n; i++) {
                result *= degree;
            }

            System.out.println(result);
        } else {
            for (var i = 0; i > n; i--) {
                result *= degree;
            }
            System.out.println(1 / result);
        }
    }
}
