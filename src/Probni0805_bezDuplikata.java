public class Probni0805_bezDuplikata {
    public static void main(String[] args) {
        String[] ulaz = {"aaa", "bbb", "aaa", "ccc", "ddd", "eee"};
        String[] bezDuplikata = nizStringovaBezDuplih(ulaz);
        stampanjeNizaStringova(bezDuplikata);
    }

    public static String[] nizStringovaBezDuplih(String[] nekiNiz) {
        int brojacDuplikata = 0;

        for (int i = 0; i < nekiNiz.length - 1; i++) {
            for (int j = i + 1; j < nekiNiz.length; j++) {
                if (!nekiNiz[j].equalsIgnoreCase("")
                        && nekiNiz[i].equalsIgnoreCase(nekiNiz[j])) {
                    brojacDuplikata++;
                    nekiNiz[j] = "";
                }
            }
        }

        String[] rezultat = new String[nekiNiz.length - brojacDuplikata];
        int j = 0;
        for (int i = 0; i < nekiNiz.length; i++) {
            if (!nekiNiz[i].equalsIgnoreCase("")) {
                rezultat[j] = nekiNiz[i];
                j++;
            }
        }
        return rezultat;
    }

    public static void stampanjeNizaStringova(String[] nekiNiz) {
        System.out.println("Niz stringova: ");
        for (int i = 0; i < nekiNiz.length; i++) {
            System.out.println(nekiNiz[i]);
        }
    }
}
