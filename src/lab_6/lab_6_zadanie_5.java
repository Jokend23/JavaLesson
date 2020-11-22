package lab_6;

import java.util.Random;

public class lab_6_zadanie_5 {
    //@authored Korobko A.
    public static void main(String[] args) {
        Random rand = new Random();

        for (var i = 0; i < 3; i++) {
            for (var j = 0; j < 5; j++) {
                System.out.print(rand.nextInt(10) + " ");
            }

            System.out.println();
        }
    }
}
