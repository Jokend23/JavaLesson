package lab_6;

import java.util.Random;

public class lab_6_zadanie_1 {
    //@authored Korobko A.
    public static void main(String[] args) {
        int[] myArray = new int[25];
        Random rand = new Random();
        int min = 0;
        int max = 0;

        int indexMin = 0;
        int indexMax = 0;
        int swap = 0;

        for (var i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt() % 100;

            System.out.print(myArray[i] + ", ");

            if (myArray[i] < min) {
                min = myArray[i];
                indexMin = i;
            }
            if (myArray[i] > max) {
                max = myArray[i];
                indexMax = i;
            }
        }

        System.out.println();

        swap = myArray[indexMax];
        myArray[indexMax] = myArray[indexMin];
        myArray[indexMin] = swap;

        for (var j = 0; j < myArray.length; j++) System.out.print(myArray[j] + ", ");
    }
}
