import java.util.Scanner;

public class Dom0601_kvadratIkoren {
    public static void main(String[] args) {
    /*
    3. Napisati program koji koristi metode za ispisivanje kvadrata i korena unetog broja.
     */
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite neki broj: ");
        double unetiBroj = sc.nextDouble();
        kvadratUnetogBroja(unetiBroj);
        korenUnetogBroja(unetiBroj);
    }

    public static void kvadratUnetogBroja(double a) {
        double kv = Math.pow(a, 2);
        System.out.println("Kvadrat broja " + a + " iznosi: " + kv);
    }

    public static void korenUnetogBroja(double a) {
        double ko = Math.sqrt(a);
        System.out.println("Koren broja " + a + " iznosi: " + ko);
    }
}
