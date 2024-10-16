import java.util.ArrayList;
import java.util.Scanner;

public class Projekat_Bingo {
    public static void main(String[] args) {
    /*
    Bingo Projekat
Napraviti program koji se sastoji od tri metode:
-unesiBrojeve() -> metoda vraca niz od 6 brojeva, to mogu biti brojevi koji su odmah definisani,
ubaceni preko skenera ili ubaceno preko Math.random(). Ovih 6 brojeva ce biti brojevi koji ce korisnik
pogadjati.
-generisi() -> vraca nam niz od 30 nasumnicnih brojeva(nije bitno ako ima duplikata).
-bingo(int[] niz1,int[] niz2) -> prethodno dva izgenerisana niza proslednjujemo ovoj metodi i proveravamo
Koliko se nasih brojeva nalazi u izgenerisanom nizu, ispisati poruku ako korisnik pogodi bingo!
**Ukoliko ima potrebe za neke modifikacije metoda u smislu da dodate nesto, napravite pomocnu metodu i to,
to je sve dozvoljno
     */
        ArrayList<Integer> unetih6 = unesiBrojeve();
        System.out.println("Vas tiket: " + unetih6);

        ArrayList<Integer> generisanih30 = generisi();
        System.out.println("Izvuceni su sledeci brojevi: ");
        System.out.println(generisanih30);

        int brojPogodaka = bingo(unetih6, generisanih30);
        if (brojPogodaka == 0) {
            System.out.println("Nemate nijedan pogodak.");
        } else if (brojPogodaka == 1) {
            System.out.println("Pogodili se " + brojPogodaka + " broj!");
        } else if (brojPogodaka > 1 && brojPogodaka < 5) {
            System.out.println("Pogodili ste " + brojPogodaka + " broja!");
        } else if (brojPogodaka == 5) {
            System.out.println("Pogodili ste " + brojPogodaka + " brojeva!");
        } else {
            System.out.println("BINGO!!! Pogodili ste svih " + brojPogodaka + " brojeva. CESTITAMO!");
        }
    }

    public static ArrayList<Integer> unesiBrojeve() {
        ArrayList<Integer> lista6 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Dobrodosli u igru na srecu BINGO!");
        System.out.println("Unesite 6 razlicitih brojeva izmedju 1 i 90 (brojevi se ne smeju duplirati): ");

        for (int i = 0; i < 6; i++) {
            int trBroj = sc.nextInt();

            if (trBroj > 0 && trBroj <91) {
                if (!lista6.contains(trBroj)) {
                    lista6.add(trBroj);
                } else {
                    System.out.println("Broj " + trBroj + " je vec unet, unesite neki drugi broj od 1 do 90.");
                    i--;
                }
            } else {
                System.out.println("Broj " + trBroj + " se ne nalazi u rasponu od 1 do 90. Molim unesite ponovo.");
                i--;
            }
        }
        return lista6;
    }

    public static ArrayList<Integer> generisi() {
        ArrayList<Integer> lista30 = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            lista30.add((int) ((Math.random() * 90) + 1));
        }
        return lista30;
    }

    public static int bingo(ArrayList<Integer> unetih6, ArrayList<Integer> generisanih30) {
        int brojacPogodaka = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 30; j++) {
                if (unetih6.get(i) == generisanih30.get(j)) {
                    brojacPogodaka++;
                }
            }
        }
        return brojacPogodaka;
    }
}
