package lab_5;

import java.util.Scanner;

public class lab_5_zadanie_1 {
    //@authored Korobko A.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите произвольное число от 0 до 9: ");
        int num = sc.nextInt();

        if (num <=9 & num >= 0) {
            if (num == 0) {
                System.out.println("Ноль");
            } else if (num == 1) {
                System.out.println("Один");
            } else if (num == 2) {
                System.out.println("Два");
            } else if (num == 3) {
                System.out.println("Три");
            } else if (num == 4) {
                System.out.println("Четыре");
            } else if (num == 5) {
                System.out.println("Пять");
            } else if (num == 6) {
                System.out.println("Шесть");
            } else if (num == 7) {
                System.out.println("Семь");
            } else if (num == 8) {
                System.out.println("Восемь");
            } else if (num == 9) {
                System.out.println("Девять");
            }
        } else {
            System.out.println("Ошибка: Введено неверное значение.");
        }
    }
}
