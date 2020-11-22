package lab_6;

import java.util.Random;

public class lab_6_zadanie_4 {
    //@authored Korobko A.
    public static void main(String[] args) {
        int[] myArray = new int[30];
        int sumEvenNums = 0;
        int sumOddNums = 0;
        Random rand = new Random();

        for (var i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt() % 100;
            System.out.print(myArray[i] + ", ");


            if (myArray[i] % 2 == 0) {
                sumEvenNums += myArray[i];
            } else {
                sumOddNums += myArray[i];
            }
        }
        System.out.print("\nСумма четных: " + sumEvenNums);
        System.out.print("\nСумма нечетных: " + sumOddNums);

    }
}
