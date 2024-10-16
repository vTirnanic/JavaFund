import java.util.Scanner;

public class Dom0203_kalkulator {
    public static void main(String[] args) {
        /*
        3. Napisi jednostavan kalkulator koji trazi od korisnika da unese dva broja i operaciju (+ ili -).
        Na osnovu izbora korisnika, program treba da izvrsi odgovarajucu operaciju.
        (char operacija = sc.next().charAt(0); -> za ucitavanje znaka)
        *charAt(i) vraca karatker na i-tom mestu iz stringa,
        brojanje pocinje od 0 => charAt(0) -> vraca karakter na prvoj poziciji stringa
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Pozdrav!");
        System.out.println("Ovo je program za sabiranje i oduzimanje brojeva.");
        System.out.print("Unesite prvi broj: ");
        if (sc.hasNextDouble()) {

            double x = sc.nextDouble();
            System.out.print("Unesite drugi broj: ");
            double y = sc.nextDouble();
            System.out.print("Odaberite zeljenu operaciju, unesite znak + ili -: ");
            char operacija = sc.next().charAt(0);
            if (operacija == '+') {
                System.out.println("Zbir ova dva broja iznosi: " + (x + y));
            } else if (operacija == '-') {
                System.out.println("Razlika ovih brojeva iznosi: " + (x - y));
            } else {
                System.out.println("Pogresan unos, unesite znak + ili -.");
            }

        } else {
            System.out.println("Pogresan unos. Molim unesite neki broj.");

        }


    }
}
