package lab_6;

import java.util.Random;

public class lab_6_zadanie_3 {
    //@authored Korobko A.
    public static void main(String[] args) {
        int[] myArray = new int[20];
        Random rand = new Random();
        int myArraySumNums = 0;

        for (var i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt() % 100;
            myArraySumNums += myArray[i];
            System.out.print(myArray[i] + ", ");
        };

        float myArrayMean = (float) myArraySumNums / myArray.length;

        System.out.print("\nСумма = " + myArraySumNums);
        System.out.print("\nДлина массива = " + myArray.length);
        System.out.print("\nСреднее значение = " + myArrayMean);
    }
}
