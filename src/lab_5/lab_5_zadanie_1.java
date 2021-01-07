package lab_5;

import java.util.Scanner;

public class lab_5_zadanie_1 {
    //@authored Korobko A.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите произвольное число от 0 до 9: ");
        String inputValue = sc.nextLine();

        double inputNum = Double.parseDouble(inputValue);

        if (inputValue.contains(".")) {
            System.out.println("Ошибка: Вы ввели не целое число");
        } else {
            if (inputNum <=9 & inputNum >= 0) {
                if (inputNum == 0) {
                    System.out.println("Ноль");
                } else if (inputNum == 1) {
                    System.out.println("Один");
                } else if (inputNum == 2) {
                    System.out.println("Два");
                } else if (inputNum == 3) {
                    System.out.println("Три");
                } else if (inputNum == 4) {
                    System.out.println("Четыре");
                } else if (inputNum == 5) {
                    System.out.println("Пять");
                } else if (inputNum == 6) {
                    System.out.println("Шесть");
                } else if (inputNum == 7) {
                    System.out.println("Семь");
                } else if (inputNum == 8) {
                    System.out.println("Восемь");
                } else if (inputNum == 9) {
                    System.out.println("Девять");
                }
            } else {
                System.out.println("Ошибка: Введено значение вне доступного диапазона.");
            }
        }
    }
}
