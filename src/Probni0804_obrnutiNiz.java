public class Probni0804_obrnutiNiz {
    public static void main(String[] args) {
    /*
    Zadatak 4(Ogledalo):
Napraviti metodu koja prihvata niz brojeva i kao rezultat vraca taj niz samo
u obrnutom redosledu.
     */
        int[] nizBrojeva = {1, 2, 3, 4, 5, 6, 7};
        int[] obNiz = obrnutiNiz(nizBrojeva);
        stampanjeNiza(obNiz);

    }

    public static int[] obrnutiNiz(int[] nekiNiz) {
        int[] noviNiz = new int[nekiNiz.length];
        int j=0;
        for (int i = nekiNiz.length-1; i>=0; i--) {
            noviNiz[j] = nekiNiz[i];
            j++;
        }
        return noviNiz;
    }

    public static void stampanjeNiza(int[] nekiNiz) {
        System.out.println("Obrnuti niz brojeva: ");
        for (int i = 0; i < nekiNiz.length; i++) {
            System.out.println(nekiNiz[i]);
        }
    }
}
