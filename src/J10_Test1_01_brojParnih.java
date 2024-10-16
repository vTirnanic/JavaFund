public class J10_Test1_01_brojParnih {
    public static void main(String[] args) {
    /*
    Zadatak 1:
Napraviti metodu koja prihvata niz brojeva i vraca broj parnih brojeva u nizu.
     */
     int[] niz = {1,3,5,8,7,9};
     int brojParnih = brojanjeParnih(niz);
     System.out.print(brojParnih);
    }

    public static int brojanjeParnih(int[] niz) {
        int brojac = 0;
        for (int i = 0; i< niz.length; i++) {
            if (niz[i]%2==0) {
                brojac++;
            }
        }
        return brojac;
    }

    public static void stampaj(String[] niz) {
        for(int i=0; i<niz.length;i++) {
            System.out.println(niz[i]);
        }
    }
}
