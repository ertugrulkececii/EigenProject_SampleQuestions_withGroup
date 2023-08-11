package day01_grupClaismasi;

import java.util.Scanner;

public class G02_grupCalismasi_soru21 {
    public static void main(String[] args) {

       /* Soru 21-)  ---> Mülakat Sorusu / Interview Sorusu / Leak Year
        Bir aydaki gün sayısını bulmak için bir Java programı yazın

        Örnek:
        Bir ay numarası girin: 2
        Bir yıl girin: 2016
        Şubat 2016'da 29 gün vardır
        ipucu:
        Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir.
        Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
                Artık yıl ile ilgili olarak NOT düşeyim değerli arkadaşlar!
                ipucu2:
        ARTIK YILI BULABİLMENİZ İÇİN İKİ KOŞULU GÖZ ÖNÜNDE BULUNDURUN!:
        1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
                Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
        2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa, yine bu yıl yine artık yıldır.
                Mesela 2000 yılı artık yıldır.Son iki rakamı "00" ve 400 e bölünebilen bir sayıdır.

        */

        Scanner scanner = new Scanner(System.in);


        System.out.println("Istediginiz aydaki gun sayisini gormek icin bir ay numarasi giriniz: ");
        int ayNo = scanner.nextInt();


        while (ayNo > 12) {
            System.out.println("Hatali ay numarasi girdiniz tekarar giriniz");
            ayNo = scanner.nextInt();

        }
        System.out.println("Istediginiz yili giriniz: ");
        int yil = scanner.nextInt();

        switch (ayNo) {
            case 1:
                System.out.println("Ocak " + yil + "'da 31 gun vardir. ");
                break;
            case 2:
                if (yil%4==0)
                    System.out.println("Subat " + yil + "'da 29 gun vardir ve artik yildir.");

         else System.out.println("Subat " + yil + "'da 28 gun vardir.");
        break;
        case 3:
        System.out.printf("Mart " + yil + "'da 31 gun vardir. ");
        break;
        case 4:
        System.out.println("Nisan " + yil + "'da 30 gun vardir.");
        case 5:
        System.out.printf("Mayis " + yil + "'da 31 gun vardir. ");
        break;
        case 6:
        System.out.printf("Haziran " + yil + "'da 30 gun vardir. ");
        break;
        case 7:
        System.out.println("Temmuz " + yil + "'da 31 gun vardir. ");
        break;
        case 8:
        System.out.println("Agustos " + yil + "'da 31 gun vardir. ");
        break;
        case 9:
        System.out.println("Eylul" + yil + ".ay 30 gun vardir. ");
        break;
        case 10:
        System.out.println("Ekim " + yil + "'da 31 gun vardir.");
        case 11:
        System.out.printf("Kasim " + yil + "'da 30 gundur. ");
        break;
        case 12:
        System.out.println("Aralik " + yil + "'da 31 gun vardir. ");
        break;
        }

    }


}

