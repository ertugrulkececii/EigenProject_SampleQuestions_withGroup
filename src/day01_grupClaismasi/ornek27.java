package day01_grupClaismasi;

import java.util.Arrays;

public class ornek27 {
    public static void main(String[] args) {
        /*27----
    Array listesindeki 2. en bÃ¼yÃ¼k sayÄ±yÄ± bulan Java Kodunu yazÄ±nÄ±z.

    Array: [1232,2345,5467,678,3454,2312,3451]
    */


        int arr[] = {1232, 2345, 5467, 678, 3454, 2312, 3451};
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);
    }

}

