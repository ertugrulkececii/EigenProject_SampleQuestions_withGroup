package day21_ArraylariMainMethoddaYazma;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C01_ArrayinTumElementleriniArtirma {
    public static void main(String[] args) {

        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir code olusturun.
        // Eski array’i yeni haliyle kaydedin.


        int[] arr= {3,4,6,8,1};

        for (int i = 0; i < arr.length; i++) {

            arr[i]+=2;

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[3]);

    }

}
