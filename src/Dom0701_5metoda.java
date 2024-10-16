import java.util.Scanner;

public class Dom0701_5metoda {
    public static void main(String[] args) {
       /*
    1. Napisati program koji omogucava korisniku da unese niz celih brojeva. Program treba da ima sledeće metode:
- Metoda za unos niza
- Metoda za stampanje niza
- Metoda za racunanje srednje vredsnoti brojeva u nizu
- Metoda za sabiranje svih dvocifrenih brojeva
- Metoda za vracanje razlike izmedju minimalnog i maksimalnog elementa niza
     */
        int[] unetiNiz = unosNiza();
        stampanjeNiza(unetiNiz);
        System.out.println("Srednja vrednost brojeva u nizu iznosi: " + srednjaVNiza(unetiNiz));
        System.out.println("Zbir svih dvocifrenih brojeva u nizu iznosi: " + sabiranjeDvocifrenih(unetiNiz));
        System.out.println("Razlika izmedju MAX i MIN elementa ovog niza iznosi: " + razlikaMaxMin(unetiNiz));
    }

    public static int[] unosNiza() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj elemenata niza celih brojeva koji cemo formirati: ");
        int brojEl = sc.nextInt();

        int[] niz = new int[brojEl];
        System.out.println("Unesite neki niz celih brojeva: ");
        for (int i = 0; i < brojEl; i++) {
            niz[i] = sc.nextInt();
        }
        return niz;
    }

    public static void stampanjeNiza(int[] nekiNiz) {
        System.out.println("Niz brojeva: ");
        for (int i = 0; i < nekiNiz.length; i++) {
            System.out.println(nekiNiz[i]);
        }
    }

    public static double srednjaVNiza(int[] nekiNiz) {
        double suma = 0;
        for (int i = 0; i < nekiNiz.length; i++) {
            suma += nekiNiz[i];
        }
        return suma / nekiNiz.length;
    }

    public static int sabiranjeDvocifrenih(int[] nekiNiz) {
        int suma = 0;
        for (int i = 0; i < nekiNiz.length; i++) {
            if (nekiNiz[i] < 100 && nekiNiz[i] > 9) {
                suma += nekiNiz[i];
            }
        }
        return suma;
    }

    public static int razlikaMaxMin(int[] nekiNiz) {
        int min = nekiNiz[0];
        for (int i = 0; i < nekiNiz.length; i++) {
            if (nekiNiz[i] < min) {
                min = nekiNiz[i];
            }
        }

        int max = nekiNiz[0];
        for (int i = 0; i < nekiNiz.length; i++) {
            if (nekiNiz[i] > max) {
                max = nekiNiz[i];
            }
        }
        return max - min;
    }
}
