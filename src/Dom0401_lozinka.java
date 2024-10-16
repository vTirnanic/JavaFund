import java.util.Scanner;

public class Dom0401_lozinka {

    public static void main(String[] args) {
        /*
        1. Napisi program koji koristi do-while petlju da omoguci korisniku unos lozinke sve dok ne
unese ispravnu lozinku. Ispravna lozinka moze biti unapred inicijalozovana.
         */

        Scanner sc = new Scanner(System.in);
        String lozinka;
        String tacnaLozinka = "Sifrasifra";

        do {
            System.out.print("Molim, unesite sifru: ");
            lozinka = sc.nextLine();

        } while (!lozinka.equals(tacnaLozinka));

        System.out.print("Uspesno logovanje!");
    }
}
