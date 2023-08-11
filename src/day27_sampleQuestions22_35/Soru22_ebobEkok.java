package day27_sampleQuestions22_35;

import java.util.Scanner;

public class Soru22_ebobEkok {
    public static void main(String[] args) {

          /*Soru 22-)
        Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
        Giriş :
        30 ve 40

        Beklenen Çıktı:
        30 ve 40 için EBOB= 10
        30 ve 40 için EKOK= 120
        ipucu:
        Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 pozitif tam sayi girin: ");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int ebob = 0;
        int ekok = 0;

        int sayac = 0;

        int refEbob = 0;
        if (sayi1 < sayi2) {
            refEbob = sayi1;
        } else {
            refEbob = sayi2;
        }
        for (int i = refEbob; i >= 2; i--) {

            if (sayi1 % i == 0 && sayi2 % i == 0) {

                System.out.println("girilen sayilarin Ebob'u " + i);
                sayac++;
                break;
            }

        }
        if (sayac == 0) {
            System.out.println("Girilen sayilarin ortak boleni yoktur");
        }
        sayac = 0;
        for (int i = 1; i < 100000; i++) {

            if (i % sayi1 == 0 && i % sayi2 == 0) {
                System.out.println("girilen sayilarin Ekok degeri: " + i);
                sayac++;
                break;
            }

        }
        if (sayac==0){
            System.out.println("Girdiginiz sayilarin 100000'den kucuk bir Ekok degeri yoktur");
        }
    }
}
