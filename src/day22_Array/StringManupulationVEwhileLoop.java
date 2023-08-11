package day22_Array;

import java.util.Scanner;

public class StringManupulationVEwhileLoop {
    public static void main(String[] args) {


        /*SORU : kullanicidan bir mail alin
                - mail @ icermiyorsa "gecersiz mail"
                - mail @gmail.com icermiyorsa, "mail gmail olmali"
                - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"

         */



        boolean flag = false;


        while (flag==false) {
            int sayac = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lutfen bir mail adresi giriniz: ");
            String mail = scanner.nextLine();

            if (!(mail.contains("@"))) {
                System.out.println("Gecersiz mail");
                sayac++;

            }  if (!(mail.contains("@gmail.com"))) {
                System.out.println("mail gmail olmali");
                sayac++;

            }  if (!(mail.endsWith("@gmail.com"))) {
                System.out.println("mail de yazim hatasi var");
                sayac++;

            }if (sayac==0 )
            {
                flag=true;
                System.out.println("mailiniz basariyla kaydedildi.");
            }



        }

    }
}
