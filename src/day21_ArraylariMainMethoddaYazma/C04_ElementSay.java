package day21_ArraylariMainMethoddaYazma;

public class C04_ElementSay {
    public static void main(String[] args) {

        // Soru 4- Verilen bir array'de istenen bir elemanin var olup olmadigini
//         ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr={3,5,2,3,5,6,7,1,8};
        int arananSayi=3;


        int sayac=0;
        for (int i = 0; i < arr.length; i++) {

            if (arananSayi==arr[i]){
              sayac++;
            }

        }
        if (sayac==0){
            System.out.println("Aranan sayi Arrayde yok");

        }else {
            System.out.println("Aranan eleman Arrayde "+sayac+" tane bulunmaktadir");
        }


    }
}
