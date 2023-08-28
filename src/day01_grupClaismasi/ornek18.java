package day01_grupClaismasi;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ornek18 {
    /*18----
    Girilen Stringdeki tum sesli harfleri saymak icin bir Java Methodu yaziniz.

    Test Data:
    java is fun

    Beklenen :

    Stringdeki sesli harf sayisi: 4

    */
    public static void main(String[] args) {
        System.out.println(sesliHarfSayisiBul());
    }

        public static int sesliHarfSayisiBul() {

            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen bir String yaziniz :");
            String str = scan.nextLine();

            int sesliSayisi = 0;

            for (int i = 0; i < str.length(); i++) {
                char harf =str.toLowerCase().charAt(i);
                if (harf == 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u') {
                    sesliSayisi++;
                }
            }
            return sesliSayisi;
        }

}


