public class J10_Test1_03_maxUnizu {
    public static void main(String[] args) {
    /*
    Zadatak 3:
Napraviti metodu koja prihvata niz brojeva i vraca najveci broj iz niza.
     */
        int[] niz = {5, 101, 6, 97, 7, 8};
        int najveciBroj = najveciUnizu(niz);

        System.out.print(najveciBroj);

    }

    public static int najveciUnizu(int[] niz) {
        int najvecibroj = niz[0];

        for (int i = 1; i < niz.length; i++) {
            if (niz[i] > najvecibroj) {
                najvecibroj = niz[i];
            }
        }
        return najvecibroj;
    }
}
