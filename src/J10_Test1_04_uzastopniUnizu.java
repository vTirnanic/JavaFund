public class J10_Test1_04_uzastopniUnizu {
    public static void main(String[] args) {
    /*
    Zadatak 4(xo):
Napraviti metodu koja prima niz karaktera(sastoje se samo od x i o), vraca nam karakter koji se
nalazi uzastopno 3 puta za redom.
Primer:
{x,o,o,x,o,o,o,x,x} -> o je pobednik!
*/
        char[] niz = {'x', 'o', 'o', 'o', 'x'};
        char slovoKSP = triPutaUzastopno(niz);

        if (slovoKSP == ' ') {
            System.out.println("Nema pobednika.");
        } else {
            System.out.println(slovoKSP + " je pobednik!");
        }
    }

    public static char triPutaUzastopno(char[] niz) {

        for (int i = 0; i < niz.length - 2; i++) {
            if ((niz[i] == niz[i + 1]) && (niz[i + 1] == niz[i + 2])) {
                return niz[i];
            }
        }
        return ' ';
    }
}
