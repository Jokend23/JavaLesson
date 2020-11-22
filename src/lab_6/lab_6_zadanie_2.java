package lab_6;

import java.util.Random;

public class lab_6_zadanie_2 {
    //@authored Korobko A.
    public static void main(String[] args) {
        int[] myArray = new int[25];
        int min = 0;
        int indexMin = 0;
        int tmpValue = 0;

        Random rand = new Random();

        // Заполняем массив случайными числами.
        for (var i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt() % 100;
            System.out.print(myArray[i] + ", ");
        };

        for (var j = 0; j < myArray.length; j++) {
            min = myArray[j];
            indexMin = j;

            for (var d = j + 1; d < myArray.length; d++) {
                if (myArray[d] < min) {
                    min = myArray[d];
                    indexMin = d;
                }
            }

            if (j != indexMin) {
                tmpValue = myArray[j];
                myArray[j] = myArray[indexMin];
                myArray[indexMin] = tmpValue;
            }
        }

        System.out.println();
        for (var k = 0; k < myArray.length; k++) {
            System.out.print(myArray[k] + ", ");
        };
    }
}
