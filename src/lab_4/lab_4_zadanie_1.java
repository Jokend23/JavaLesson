package lab_4;

import java.math.BigInteger;
import java.util.ArrayList;

public class lab_4_zadanie_1 {
    //@authored Korobko A.
    private static ArrayList<BigInteger> numBox = new ArrayList<>(100);

    private static void fillBox(final int pow) {
        for (int i = 1; i < 101; i++) {
            numBox.add(new BigInteger(i + "").pow(pow));
        }
    }

    private static void print_numbers_of_ferma(final int pow) {
        BigInteger a, b, c;
        fillBox(pow);
        System.out.printf("Все натуральные решения теоремы Ферма для степени %d%n", pow);
        for (int i = 0; i < numBox.size(); i++) {
            a = numBox.get(i);
            for (int j = i; j < numBox.size(); j++) {
                b = numBox.get(j);

                c = a.add(b);
                if (numBox.contains(c)) {
                    System.out.printf("a = %d, b = %d, степень = %d", i+1, j+1, pow);
                    System.out.println();
                    System.out.printf("%d + %d = %d%n", a, b, c);
                    System.out.println();
                }
            }
        }
        numBox.clear();
    }

    public static void main(String[] args) {
        print_numbers_of_ferma(2);
        print_numbers_of_ferma(3);
        print_numbers_of_ferma(11);
    }
}
