package day27_sampleQuestions22_35;

public class Soru24_CiftSAyilariSaydirma {

   /* Soru 24-)
            20'den 0'a kadar çift sayıları yazdırın ancak decrement (i--) kullanmayın.
    Örnek:
            100'den 0'a kadar Çift Sayılar şunlardır: 20 18 16 14 12 10 8 6 4 2 0
    ipucu:
    Loop içinde if kullanarak çözebilirsiniz. % kullanmak iyi bir fikir olabilir

    */
    public static void main(String[] args) {
        int sayi=20;

        for (int i = sayi; i >=0 ;) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i -= 2;
        }
    }
}
