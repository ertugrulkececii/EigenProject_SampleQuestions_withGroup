package day21_ArraylariMainMethoddaYazma;

import java.util.Arrays;

public class C02_ArrayinElementleriniIstenenKadarArtirma {
    public static void main(String[] args) {

        // verilen array'in tum elementlerini
        // artis miktari kadar artirin

        int[] arr={3,5,2,7};
        int artis=3;

        for (int i = 0; i <arr.length ; i++) {

            arr[i]+=artis;

        }
        System.out.println(Arrays.toString(arr));
    }
}
