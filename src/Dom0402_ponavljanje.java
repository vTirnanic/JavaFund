import java.util.Scanner;

public class Dom0402_ponavljanje {

    public static void main(String[] args) {
        /*
        2.Napisi program koji koristi while petlju da omogući korisniku unos dva broja. Program
treba da ispise rezultat deljenja prvog broja sa drugim. Petlja treba da se ponavlja u slucaju
da je drugi broj jednak nuli.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        double x = sc.nextDouble();
        System.out.print("Unesite drugi broj: ");
        double y = sc.nextDouble();

        while (y == 0) {
            System.out.print("Unesite drugi broj: ");
            y = sc.nextDouble();
        }
        System.out.print("Kolicnik ova dva broj je: " + (x / y));
    }
}
