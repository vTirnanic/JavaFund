public class P01_brojPojavljivanjaStringa {
    public static void main(String[] args) {
/*
Zadatak 1:
Napraviti metodu koja prihvata niz String-ova i jos jedan String,
 vraca broj pojavljivanja tog String-a u nizu.
 */
        String[] nizS = {"sony", "panasonic", "denon", "bowers", "denon"};
        String hifi = "denon";
        int brojP = brojStringovauNizu(nizS, hifi);
        System.out.println(brojP);
        System.out.println("Broj pojavljivanja stringa '" + hifi + "' u nizu je: " + brojP);
    }

    public static int brojStringovauNizu(String[] nekiNizS, String nekiString) {
        int brojPojavljivanja = 0;
        for (int i = 0; i < nekiNizS.length; i++) {
            if (nekiNizS[i].equalsIgnoreCase(nekiString)) {
                brojPojavljivanja++;
            }
        }
        return brojPojavljivanja;
    }
}
