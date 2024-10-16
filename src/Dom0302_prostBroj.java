import java.util.Scanner;

public class Dom0302_prostBroj {
    /*
    2. Napisi program koji koristi for petlju da proveri da li je broj N prost. Korisnik treba da unese
    vrednost N, a program treba da ispita da li je taj broj deljiv samo sa 1 i sa samim sobom. Ispiši
    odgovarajuću poruku.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite neki prirodan broj: ");
        int unetiBroj = sc.nextInt();
        boolean prostBroj = true;


        if (unetiBroj <= 1) {
            System.out.println("Ovo je nije prost broj.");
        } else {
            for (int i = 2; i <= Math.sqrt(unetiBroj); i++) {
                if (unetiBroj % i == 0) {
                    prostBroj = false;
                }
            }

            if (prostBroj) {
                System.out.println("Ovo je prost broj.");
            } else {
                System.out.println("Ovo je slozen broj.");
            }
        }
    }
}