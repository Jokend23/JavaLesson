package lab_3;

import java.util.Scanner;

public class lab_3_zadanie_2 {
    //@authored Korobko A.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите произвольное число n < 10: ");
        int n = sc.nextInt();
        int result = 1;

        if (n < 10) {
            for (var i = 0; i < n; i++) {
                result += result * i;
            }
        } else {
            System.out.println("Ошибка: Неверно введенное число n.");
        }

        System.out.println(result);
    }
}
