public class T1_06_najduziNizStingova {
    public static void main(String[] args) {
    /*
    Zadatak 6:
Napraviti metodu koja prima 3 niza String-ova i ispisuje nam poruku koji je od ta 3 niza najveci.
*/
        String[] niz1 = {"Prvi", "Drugi", "Treci"};
        String[] niz2 = {"Prvi", "Drugi", "Treci", "Cetvrti"};
        String[] niz3 = {"Prvi", "Drugi"};

        najduziNiz(niz1, niz2, niz3);
    }

    public static void najduziNiz(String[] niz1, String[] niz2, String[] niz3) {
        if (niz1.length>niz2.length && niz1.length > niz3.length) {
            System.out.println("Prvi niz je naduzi.");
        } else if (niz2.length>niz1.length && niz2.length > niz3.length) {
            System.out.println("Drugi niz je naduzi.");
        } else if (niz3.length>niz2.length && niz3.length > niz1.length) {
            System.out.println("Treci niz je naduzi.");
        } else {
            System.out.println("Postoji vise nizova sa jednakim brojem elemenata.");
        }
    }
}
