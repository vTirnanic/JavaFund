import java.util.Scanner;

public class Dom0501_sumauNizu {
    public static void main(String[] args) {
        /*
        1. Napisati program koji trazi od korisnika da unese niz celih brojeva i vraca sumu svih elemenata niza
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj elemenata za niz celih brojeva koji cemo napraviti: ");
        int brojElemenata = sc.nextInt();
        int[] niz = new int[brojElemenata];

        for (int i = 0; i < brojElemenata; i++) {
            System.out.print("Unesite " + (i + 1) + ". broj u nizu: ");
            niz[i] = sc.nextInt();
        }

        int suma = 0;
        for (int i = 0; i < brojElemenata; i++) {
            suma += niz[i];
        }
        System.out.println("Zbir svih brojeva u ovom nizu je " + suma);
    }
}
