public class Dom0101_obimPravougaonika {
    public static void main(String[] args) {
    /*
    1. Napisati program koji računa površinu i obim pravougaonika sa zadatim dimenzijama
    a = 5 i b = 13 (dužine stranica).
     */
        int a = 5;
        int b = 13;
        int povrsina = a * b;
        int obim = 2 * (a + b);

        System.out.println("Povrsina pravougaonika cije su stranice 5 i 13 cm je " + povrsina + " cm2, a njegov obim je " + obim + " cm.");
    }
}
