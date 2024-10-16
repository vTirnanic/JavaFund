import java.util.Scanner;

public class Dom0202_ocene {
    public static void main(String[] args) {
    /*
    2. Napisati progam koji za uneti broj poena (0-100) dodeljuje odgovarajucu ocenu (6, 7, 8, 9, 10)
    prema sledecem ranigiranju
    51-60, 61-70, 71-80, 81-90, 91-100
    Ako je broj poena manji od 51, ispisati poruku da je broj bodova nedovoljan za polaganje ispita.
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("Pozdrav! Ovo je program za odredjivanje ocene na osnovu broja poena na testu. ");
        System.out.print("Budite ljubazni i unesite broj poena sa testa: ");
        if (sc.hasNextFloat()) {
            float poeni = sc.nextFloat();

            if (poeni >= 0 && poeni < 51) {
                System.out.println("Broj bodova je nedovoljan za polaganje ispita");
            } else if (poeni >= 51 && poeni <= 60) {
                System.out.println("Broj bodova odgovara oceni 6");
            } else if (poeni >= 61 && poeni <= 70) {
                System.out.println("Broj bodova odgovara oceni 7");
            } else if (poeni >= 71 && poeni <= 80) {
                System.out.println("Broj bodova odgovara oceni 8");
            } else if (poeni >= 81 && poeni <= 90) {
                System.out.println("Broj bodova odgovara oceni 9");
            } else if (poeni >= 91 && poeni <= 100) {
                System.out.println("Broj bodova odgovara oceni 10");
            } else {
                System.out.println("Pogresan unos, uneti broj bodova je veci od maksimalnog.");
            }

        } else {
            System.out.println("Pogrešan unos. Molim unesite pozitivan broj.");
        }

    }
}
