package day27_sampleQuestions22_35;

import java.util.Arrays;

public class Soru33_CumleyiArrayOlarakTersCevirme {
    public static void main(String[] args) {
        //  Soru 33-)
        //  Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın (boşluklar ve özel karakterler dahil).
        //  Örnek:
        // String str=''Kodlama harika.''
        // String arr[]: ".etaerg si gnidoC"
        //  İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın

        String cumle = "Kodlama harika.";
        String[] arr = cumle.split("");

        String[] tersArr = new String[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            tersArr[arr.length-1-i] = arr[i];
        }

        for (int i = 0; i <tersArr.length ; i++) {
            System.out.print(tersArr[i]); // .akirah amaldoK
        }
        }
    }

