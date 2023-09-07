package day01_grupClaismasi;

import java.util.ArrayList;
import java.util.Scanner;

public class ornek24 {
    public static void main(String[] args) {
        /*24----
    Yazilan degeri array icerisinde arayan Java Kodu yazÄ±nÄ±z.

    Array: [1551,1223,1443,1267,1789,1023,2020]


    Aranan Deger:2020
    Beklenen cikti :True

    Aranan Deger:2010
    Beklenen cikti :False
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen aradiginiz degeri giriniz :");
        int Adeger = scan.nextInt();
       /* ArrayList<Integer> arr = new ArrayList<>();
        //Array: [1551,1223,1443,1267,1789,1023,2020]
        arr.add(1551);
        arr.add(1223);
        arr.add(1443);
        arr.add(1267);
        arr.add(1789);
        arr.add(1023);
        arr.add(2020);

        System.out.println(arr.contains(Adeger));

        */
        int[] arr = {1551, 1223, 1443, 1267, 1789, 1023, 2020};
boolean sonuc=false;

for (int each:arr ) {
            if (each==Adeger){
                sonuc=true;
                System.out.println("Aranan Deger: "+Adeger+"\nBeklenen cikti : "+ sonuc);
            }

        }
        if (!sonuc){
            System.out.println("Aranan Deger: "+Adeger+ "\nBeklenen cikti :" + sonuc);
        }

    }
}
