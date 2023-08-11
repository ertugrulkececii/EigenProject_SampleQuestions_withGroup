package day23_ArrayTekrarSorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Soru30ChatCPT {






            /*String str = "Javacokkolay";
            String duplicates = "";
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        if (!duplicates.contains(String.valueOf(str.charAt(i)))) {
                            duplicates += str.charAt(i);
                        }
                    }
                }
            }
            System.out.println(duplicates);

             */


   /* public static void main(String[] args) {
        System.out.println(Arrays.to);

            String str = "Javacokkolay";


            ArrayList<String> tekrarlanan = new ArrayList<String>();

            for (int i = 0; i < str.length(); i++) {

                for (int j = i + 1; j < str.length(); j++) {

                    if (str.charAt(i) == str.charAt(j)) {

                        if (!tekrarlanan.contains(String.valueOf(str.charAt(i)))) {

                            tekrarlanan.add(String.valueOf(str.charAt(i)));
                        }
                    }
                }
            }
            System.out.println(tekrarlanan);
        }

    */

    public static void main(String[] args) {
        System.out.println("lütfen yinelenen karakterlerini bulmak istediginiz bir kelime giriniz: ");
        Scanner scanner = new Scanner(System.in);
        String kelime = scanner.next();
        String ayniKarakter = "";
        char[] kelime_array = kelime.toCharArray();
        int sayac = 0;
        for (int i = 0; i < kelime_array.length; i++) {
            sayac = 0;
            for (int j = 0; j < kelime_array.length; j++) {
                if (kelime.charAt(i) == kelime_array[j]) {
                    sayac++;
                }
            }
            if (sayac > 1 && ayniKarakter.indexOf(kelime_array[i]) < 0) {
                ayniKarakter = ayniKarakter + kelime_array[i];
            }
        }
        String[] kelimeArray = new String[ayniKarakter.length()];
        for (int i = 0; i < ayniKarakter.length(); i++) {
            kelimeArray[i] = "" + ayniKarakter.charAt(i);

        }
        System.out.println(Arrays.toString(kelimeArray));
    }
    }



