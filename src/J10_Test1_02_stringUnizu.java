public class J10_Test1_02_stringUnizu {
    public static void main(String[] args) {
/*
Zadatak 2:
Napraviti metodu koja prihvata niz String-ova i neki String, vraca nam true ako se taj String nalazi u nizu.
 */
        String[] niz = {"prvi", "drugi", "treci", "cetvrti", "peti"};
        String rec = "treci";
        boolean b = recUnizu(niz, rec);
        System.out.print(b);

    }

    public static boolean recUnizu(String[] niz, String nekiString) {
        String rec = nekiString;
        boolean b = false;
        for (int i = 0; i < niz.length; i++) {
            if (nekiString.equalsIgnoreCase(niz[i])) {
                b = true;
                break;
            }
        }
        return b;
    }
}
