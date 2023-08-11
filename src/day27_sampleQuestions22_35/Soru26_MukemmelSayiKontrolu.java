package day27_sampleQuestions22_35;

import java.util.Scanner;

public class Soru26_MukemmelSayiKontrolu {
    public static void main(String[] args) {

       /* Soru 26-)
        Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
                NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
                Örnek:
        Giriş :6
        Çıkış: 6 Mükemmel Sayıdır
        Giriş :7
        Çıkış:7 Mükemmel Sayı Değildir
        ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile bu soruyu çözebilirsiniz :wink:

        */
        Scanner scan=new Scanner(System.in);
        System.out.println("muk sayi : ");
        int muksayi= scan.nextInt();
        int toplam=0;

        for (int i=1; i <muksayi ; i++) {

            if ( muksayi%i==0){
                toplam+=i;
            }


        } if (toplam==muksayi){
            System.out.println("SAyi muk sayidir.");

        }else {
            System.out.println("sayi muk sayi degildir");


        }
    }
}
