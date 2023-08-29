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
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen String bir deger giriniz :");
        String str = scan.nextLine();


        int sesliSayisi = 0;
        int sayi = 0;

        String sesliHarfler = "aeiouAEIOU";

        while (sayi < str.length())
        {
            char ch = str.charAt(sayi);
            // Eğer bu karakter sesli harfler stringinde varsa, sayacı bir artırıyoruz
            //indexOf methodu eger "char ch = str.charAt(sayi);"'nin getirdigi bulamazsa fitrati geregi -1 dondurur.
            //Bu yuzden -1'e esit degilse diyerek bu kismi boyle yazdik.
            if (sesliHarfler.indexOf(ch) != -1) {
                sesliSayisi++;
            }
            sayi++;
        }
        System.out.println(sesliSayisi);

        /* ====================chatCPT============
        Test etmek istediğiniz stringi girin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz :");
        String str = scan.next();
        // Sesli harf sayısını hesaplayan metodu çağırın ve sonucu yazdırın
        System.out.println("Girilen stringdeki sesli harf sayısı: " + sesliHarfSayisi(str));

         */
    }


    // Bu metot, parametre olarak verilen bir stringdeki sesli harf sayısını döndürür
    public static int sesliHarfSayisi(String str) {
        // Sesli harfleri bir string olarak tanımlıyoruz
        String sesliHarfler = "aeiouAEIOU";
        // Sesli harf sayısını tutacak bir değişken tanımlıyoruz
        int sayac = 0;
        // Stringin uzunluğu kadar while döngüsüne giriyoruz
        int i = 0;
        while (i < str.length()) {
            // Stringin i. karakterini alıyoruz
            char ch = str.charAt(i);
            // Eğer bu karakter sesli harfler stringinde varsa, sayacı bir artırıyoruz
            if (sesliHarfler.indexOf(ch) != -1) {
                sayac++;
            }
            // i değişkenini bir artırıyoruz
            i++;
        }
        // Son olarak sayacı döndürüyoruz
        return sayac;
    }


}



       /* public static int sesliHarfSayisiBul() {

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

        */





