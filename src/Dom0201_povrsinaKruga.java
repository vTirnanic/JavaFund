import java.util.Scanner;

public class Dom0201_povrsinaKruga {
    public static void main(String[] args) {
        /*
        1. Napisati program koji izracunava povrsinu i obim kruga za radijus r. (2 * r * PI)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Pozdrav!");
        System.out.println("Ovo je program za izracunavanje povrsine i obima kruga.");
        System.out.print("Unesite velicinu radijusa u centimetrima i pritisnite enter: ");
        if (sc.hasNextDouble()) {  // Provera da li je unet broj tipa double
            double radijus = sc.nextDouble();
            double povrsina = radijus * radijus * Math.PI;
            double obim = 2 * radijus * Math.PI;

            if (radijus > 0) {
                System.out.println("Površina kruga čiji je radijus " + radijus + " cm, iznosi " + povrsina + " cm2.");
                System.out.println("Obim kruga čiji je radijus " + radijus + " cm, iznosi " + obim + " cm.");
            } else {
                System.out.println("Pogrešan unos. Radijus mora biti pozitivan broj.");
            }

        } else {
            System.out.println("Pogrešan unos. Molimo unesite broj.");
        }
    }
}
