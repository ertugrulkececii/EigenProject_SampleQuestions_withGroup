package day21_ArraylariMainMethoddaYazma;

public class C03_PozitifElementleriTopla {
    public static void main(String[] args) {
        //Soru 2- Verilen bir array’deki
        //        pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.

        int[]arr={-4,5,2,0,-3,5};
        int toplam=0;
        for (int j : arr) {

            if (j > 0) {
                toplam += j;
            }
        }

        System.out.println(toplam);

    }
}
