package day27_sampleQuestions22_35;

public class Soru29_SAyilarinToplami {
    public static void main(String[] args) {
       /* Soru29-)
        1'den 100'e kadar olan doğal sayıların toplamını bulmak için bir Program yazın.
                İpucu: Loop kulanabilirsiniz


         int sayi=100;
         int toplam=0;
        for (int i = 0; i <=sayi ; i++) {
            toplam+=i;

        }
        System.out.println(toplam);*/

        System.out.println(sayilarToplami(100));

    }
    public static int sayilarToplami (int sayi){

        int toplam=0;
        for (int i = 0; i <= sayi; i++) {

            toplam+=i;


        }return toplam;
    }

}
