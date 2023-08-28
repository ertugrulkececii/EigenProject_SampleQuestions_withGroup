package day01_grupClaismasi;

public class ornek17 {
    public static void main(String[] args) {

          /*17---
    Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.

    Test data:
    12,24,34

    Beklenen Çıktı: 12
    */
        int enKucukSayi = enKucukSayiBul(12, 24, 34);

        System.out.println(enKucukSayi);
    }

    public static int enKucukSayiBul(int a, int b, int c) {
        int enKucuk = a;
        if (b < enKucuk) {
            enKucuk = b;

        }
        if (c < enKucuk) {
            enKucuk = c;
        }

        return enKucuk;


    }
}

