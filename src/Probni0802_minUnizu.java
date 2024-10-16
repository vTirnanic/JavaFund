public class Probni0802_minUnizu {
    public static void main(String[] args) {
        /*
        Zadatak 2:
Napraviti metodu koja prihvata niz celih brojeva i vraca najmanji broj iz niza.
         */
        int[] nizC = {5, 8, 3, 4, 5, 6, 7, 8, 9, 1};
        int najmB = najmanjiBrojuNizu(nizC);
        System.out.println("Najmanji broj u nizu je: " + najmB);
    }

    public static int najmanjiBrojuNizu(int[] nekiNiz) {
        int najmanjiBroj = nekiNiz[0];
        for (int i = 0; i < nekiNiz.length; i++) {
            if (nekiNiz[i] < najmanjiBroj) {
                najmanjiBroj = nekiNiz[i];
            }
        }
        return najmanjiBroj;
    }
}
