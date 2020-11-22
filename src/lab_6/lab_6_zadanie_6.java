package lab_6;

import java.util.Random;

public class lab_6_zadanie_6 {
    // @authored Korobko A.
    static int[] myArray = new int[25];
    static int min = 0;
    static int max = 0;

    static int indexMin = 0;
    static int indexMax = 0;
    static int swap = 0;

    public static void change_min_array(int value, int arrayMin, int i) {
        // Находим минимальное значение массива.
        if (value < arrayMin) {
            min = value;
            indexMin = i;
        }
    }

    public static void change_max_array(int value, int arrayMax, int i) {
        // Находим максимальное значение массива.
        if (value > arrayMax) {
            max = value;
            indexMax = i;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();

        for (var i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt() % 100;

            System.out.print(myArray[i] + ", ");

            change_min_array(myArray[i], min, i);
            change_max_array(myArray[i], max, i);

        }

        System.out.print("\nmax = " + max + "\n");

        swap = myArray[indexMax];
        myArray[indexMax] = myArray[indexMin];
        myArray[indexMin] = swap;

        for (var j = 0; j < myArray.length; j++) System.out.print(myArray[j] + ", ");
    }
}
