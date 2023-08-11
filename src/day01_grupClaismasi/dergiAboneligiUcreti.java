package day01_grupClaismasi;

import java.util.Scanner;

public class dergiAboneligiUcreti {
    public static void main(String[] args) {
        /*
        Bir dergi aboneliginin ücretini hesaplayabilmek icin kullanicidan
        Abonelik zamanini ay olarak alin.
        1 - Girilen sayi negatif ise hata oldugunu bildirin ve programi bitirin
        2- 6 ay'dan az bir abonelik icin aylik ücret 6,50 Euro
        3- en az 6 ay ama 12 ay'dan az bir zaman icin aylik ücret 5,90
        4- 1 yildan itibaren abonelikler icin kullanicidan 4 haneli bir posta kodu isteyin
            4a.) Posta Kodu <1000 veya >9999 ise Hata kodu yazin ve programi bitirin
            4b) Gcerli bir Posta Kodu icin   aylik ücret 5,xx olacak- ücretin XX degeri Posta kodunun
            ortadaki haneleri (Yüzler ve onlar)   olmali.
         5- En sonunda hesaplanan aylik ücreti ve yillik ücreti yazdirin

             Please enter the duration of your subscription (in months): 14
            Please enter your zip code: %4040
            The price per month is 5,04 Euro.
            The full price for 14 months is 70,56 Euro.

         */

        int abonelikZamani;
        double aylikUcret;
        int postaKodu;
        double yillikUcret;
        String ekleme = "     ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen olusturmak istediginiz abonelik zamanini ay olarak giriniz");
        abonelikZamani = scanner.nextInt();

        aylikUcret = 0;

        if (abonelikZamani < 1) {
            System.out.println("Girdiginiz ay gecersizdir.");

        }else
        if (abonelikZamani < 6) {
            aylikUcret = 6.50;

        } else if (abonelikZamani < 12) {

            aylikUcret = 5.90;

        } else {
            aylikUcret = 5;
        }

        if (abonelikZamani >= 12) {
            System.out.println("Lütfen 4 haneli Posta Kodunuzu giriniz");
            postaKodu = scanner.nextInt();
            if (postaKodu < 1000 || postaKodu > 9999) {
                System.out.println("Girdiginiz posta kodu hatali ");

            } else {
                double sonuc = (postaKodu % 1000) / 100; //2
                double sonuc2 = (postaKodu % 100) / 10;//3

                aylikUcret += sonuc2 / 100 + sonuc / 10;


            }

        }
        System.out.println("bir aylik fiyat : " + aylikUcret + "\n"
                + abonelikZamani + " aylik abonelik fiyatiniz: " + (abonelikZamani * aylikUcret));
    }
}
