public class P03_proizvodParnih {
    public static void main(String[] args) {
        /*
        Zadatak 3:
Napraviti metodu koja prihvata niz brojeva i vraca proizvod svih parnih brojeva.
         */
        int[] nizBr = {1, 2, 3, 5, 7, 2, 5, 8};
        int prPB = proizvodSvihParnih(nizBr);
        System.out.println("Proizvod svih parnih brojeva u nizu je: " + prPB);
    }

    public static int proizvodSvihParnih(int[] nekiNiz) {
        int prParnihBrojeva = 1;
        boolean imaParnih = false;
        for (int i = 0; i < nekiNiz.length; i++) {
            if (nekiNiz[i] % 2 == 0) {
                prParnihBrojeva *= nekiNiz[i];
                imaParnih = true;
            }
        }

        if (imaParnih) {
            return prParnihBrojeva;
        } else {
            return 0;
        }
    }
}
