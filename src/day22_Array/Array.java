package day22_Array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 ={4,5,6,7,8};
        int[] arr3 = new int[8];
        for (int i = 0; i <arr2.length ; i++) {
            arr3[i]=arr2[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[arr3.length-3]=arr1[2];
            arr3[arr3.length-2]=arr1[1];
            arr3[arr3.length-1]=arr1[0];
        }
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
