import java.util.Scanner;

public class Dom0602_faktorijel {
    public static void main(String[] args) {
        /*
        4. Napisati program koji koristi metodu za izracunavanje faktorijela unetog broja.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite neki ceo broj: ");
        int unetiBroj = sc.nextInt();
        if (unetiBroj < 0) {
            System.out.print("Uneti broj je manji od nule, faktorijel nije moguce izracunati.");
        } else {
            System.out.print("Faktorijel unetog broja iznosi: " + faktorijel(unetiBroj));
        }
    }

    public static long faktorijel(int a) {
        long f = 1;
        for (int i = 1; i <= a; i++) {
            f *= i;
        }
        return f;
    }
}
