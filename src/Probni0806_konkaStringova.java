public class Probni0806_konkaStringova {
    public static void main(String[] args) {
        /*
        Zadatak 6:
Napraviti metodu koja prihvata dva niza String-ova i konkatenira sve String-ove na istim pozicijama.
         */
        String[] niz1 = {"ana", "marija", "vesna"};
        String[] niz2 = {"marija", "ana", "besna"};
        String[] niz3 = konkaStringovi(niz1, niz2);
        stampanjeNizaStringova(niz3);
    }

    public static String[] konkaStringovi(String[] prvi, String[] drugi) {
        String[] treci = new String[prvi.length];
        for (int i = 0; i < prvi.length; i++) {
            treci[i] = prvi[i] + drugi[i];
        }
        return treci;
    }

    public static void stampanjeNizaStringova(String[] nekiNiz) {
        System.out.println("Niz stringova: ");
        for (int i = 0; i < nekiNiz.length; i++) {
            System.out.println(nekiNiz[i]);
        }
    }
}
