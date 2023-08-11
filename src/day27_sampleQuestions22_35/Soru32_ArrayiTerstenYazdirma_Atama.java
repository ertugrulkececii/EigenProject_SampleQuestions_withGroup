package day27_sampleQuestions22_35;

import java.util.Arrays;
import java.util.Scanner;

public class Soru32_ArrayiTerstenYazdirma_Atama {
    public static void main(String[] args) {

      //  Soru 32-)
      //  Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
        //  İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin.


        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen Array a bir uzunluk giriniz:" );
        int arrUzunluk=scanner.nextInt();

        int[] arr= new int[arrUzunluk];
        int[] arrTers= new int[arrUzunluk];
        System.out.println("lutfen sirasiyle Array in degerlerini giriniz: " );

        for (int i = 0; i < arr.length; i++) {
            int degerler= scanner.nextInt();
            arr[i]+=degerler;
        }
        for (int i = 0;i<arr.length; i++) {

            arrTers[i]+= arr[arr.length-1-i];
            
        }
        System.out.println(Arrays.toString(arrTers));
    }
}
