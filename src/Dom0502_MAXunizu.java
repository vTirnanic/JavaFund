import java.util.Scanner;

public class Dom0502_MAXunizu {
    public static void main(String[] args) {
        /*
        2. Napisati program koji trazi od korisnika da unese niz celih brojeva
        i vraca maksimalni element u nizu
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj elemenata za niz celih brojeva koji cemo napraviti: ");
        int brojElemenata = sc.nextInt();
        int[] niz = new int[brojElemenata];

        for (int i = 0; i < brojElemenata; i++) {
            System.out.print("Unesite " + (i + 1) + ". broj u nizu: ");
            niz[i] = sc.nextInt();
        }

        int najveciBroj = niz[0];
        for (int i = 0; i < brojElemenata; i++) {
            if (niz[i] > najveciBroj) {
                najveciBroj = niz[i];
            }
        }
        System.out.println("Najveci broj u ovom nizu je " + najveciBroj);
    }
}
