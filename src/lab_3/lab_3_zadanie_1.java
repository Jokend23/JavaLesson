package lab_3;

import java.util.Scanner;

public class lab_3_zadanie_1 {
    //@authored Korobko A.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите степерь двойки: ");
        int n = sc.nextInt();
        int result = 1;
        int degree = 2;


        for (var i = 0; i < n; i++) {
            result *= degree;
        }

        System.out.println(result);
    }
}
