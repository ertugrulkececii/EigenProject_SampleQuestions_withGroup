package day27_sampleQuestions22_35;

import java.util.Scanner;

public class Soru28_TersineCevirme {
    public static void main(String[] args) {

       /* Soru-28)
        Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
        Örnek:
        Sayı: 1238
        Sayının Tersi: 8321
        İpucu:  Loop kullanabilirsiniz.
*/

        Scanner scanner= new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int sayi=scanner.nextInt();
        
    String tersSayi=sayi+ "";

        for (int i = tersSayi.length()-1;  i>=0  ; i--) {

            System.out.print(tersSayi.charAt(i));

            }

            
        }



    }


