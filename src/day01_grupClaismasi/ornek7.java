package day01_grupClaismasi;

import java.util.Scanner;

public class ornek7 {
    /*Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
        Sayı sisteminde,  ugly number  sadece asal faktörleri carpanlari 2, 3 veya 5 olan pozitif sayılardan olusur...
        İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.
        */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz: ");
        int sayi = scan.nextInt();

        boolean cirkinSayi=true;

        int[] asalCarpanlar={2,3,5};

        for (int each:asalCarpanlar
        ) {
            while (sayi%each==0){
                sayi/=each;
            }
        }
        if (sayi!=1){
            cirkinSayi=false;
        }
        if (cirkinSayi){
            System.out.println("Girilen sayi bir cirkin sayidir.");
        }else {
            System.out.println("Girilen sayi  cirkin sayi degildir.");
        }
    }
    }

