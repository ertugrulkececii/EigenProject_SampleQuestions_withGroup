package day01_grupClaismasi;

import java.util.Scanner;

public class ornek13 {
    public static void main(String[] args) {
        /*13----
    Bir palindrom, madam veya racecar veya 10801 sayisal gibi
    ileriye dogru geriye dogru okuyan bir kelime, sayisal, kelime alfabe veya diger karakter dizisidir.

    Girilecek kelimenin palindrom olup olmadigini dogrulayacak bir Java Kodu yazin.

    Test Data:
    madam

    Beklenen sonuc:
    True
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter dizisi giriniz : ");
        String dizi = scan.next();
        String tersDizi = "";

        for (int i = 0; i <= dizi.length() - 1; i++ ) {

            tersDizi +=dizi.indexOf(dizi.length()-i);
            System.out.println(tersDizi);
        }
        if (dizi.equals(tersDizi)) {
            System.out.println("Karakteriniz palindromdur.");

        } else System.out.println("Karakteriniz palindrom degildir.");
    }

    public static class ornek17 {
        public static void main(String[] args) {

              /*17---
        Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.

        Test data:
        12,24,34

        Beklenen Çıktı: 12
        */
            enKucukSayiBul(12,24,34);


        }

        public static void enKucukSayiBul(int a,int b, int c){
            int enKucuk=a;
            if(b<a&&b<c){
                enKucuk=b ;

            } else if (c<a&&c<b) {
                enKucuk=c;

            }

            System.out.println(enKucuk);
        }

    }
}
