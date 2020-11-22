package lab_4;

public class lab_4_zadanie_2 {
    //@authored Korobko A.
    public static void main(String[] args) {
        double s = 0;
        for (int x = 1; x <= 10000; x++)
            if (x % 2 == 0)
                s -= 1 / x;
            else
                s += 1 / x;

        System.out.println(s);
    }
}
