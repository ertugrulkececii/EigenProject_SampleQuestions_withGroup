package day13_Voorbeeld;

import java.util.Scanner;

public class V01_Sorulsr {
    public static void main(String[] args) {

        /*
        Kullanicidan sifre alin asagidaki sartlari kontrol edin
        sartlar saglanirsa "Sifre basariyla kaydedildi" yazin.
        - ilk harf kucuk olmali
        - Son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("typ een password");
        String password = scanner.next();

      if (!(password.charAt(0)>='a' && password.charAt(0)<='z') ){
          System.out.println("Uw eerst letter van password is niet klein!");
      } else if (!(password.charAt(password.length()-1))) {
          System.out.println("Uw laatste character is niet cijfer!");
      } else if (!(password.contains(" "))) {
          System.out.println("Uw password heeft gat/gaten!");
      } else if (!(password.length()>=10)) {
          System.out.println("Uw password lang niet gelijk met 10!");
      } else System.out.println("Password heeft succeesful geregistereerd");


    }

    }

