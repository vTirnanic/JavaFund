public class J10_Test1_05_monotonNiz {
    public static void main(String[] args) {
    /*
    Zadatak 5:
Napraviti metodu koja prima niz brojeva i proverava da li je niz monoton.
Niz je monoton ukoliko mu je vrednost ili rastuca ili opadajuca.
Primer:
Niz je monoton -> {1, 11, 21, 35}, {1, 0, -5, -10}
Niz NIJE monoton -> {1, 3, 6, 2, 11}, {5, 3, 4, 0, -2}
     */
        int[] niz = {1, 2, 3, 5, 5, 1};
        boolean b = daLijeMonoton(niz);
        System.out.print(b);
    }

    public static boolean daLijeMonoton(int[] niz) {
        boolean raste = true;
        boolean opada = true;

        for (int i = 0; i < niz.length - 1; i++) {
            if (niz[i] < niz[i + 1]) {
                opada = false;
            }
            if (niz[i] > niz[i + 1]) {
                raste = false;
            }
        }
        return raste || opada;
    }
}








