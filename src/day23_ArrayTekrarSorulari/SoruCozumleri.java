package day23_ArrayTekrarSorulari;

import java.util.Arrays;

public class SoruCozumleri {
    public static void main(String[] args) {

        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.

        // Eski array’i yeni haliyle kaydedin.

        int[] arr = {3, 4, 6, 8, 1};


        System.out.println(Arrays.toString(arrayArttirma(arr, 2)));


    }

    public static int[] arrayArttirma(int[] arr, int artis) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] += artis;
        }

        return arr;
    }
}
