package day27_sampleQuestions22_35;

public class soru23_Faktoriyel {
    /* Soru 23-)
    Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın.
     Method bize çıktıyı döndürsün.
    Örnek:
    Girdi: 6
    Çıktı: 6!=65432*1=720
    ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
     */
    public static void main(String[] args) {

        System.out.println(faktoriyel(6));
    }
    public static int faktoriyel (int tamsayi) {

        int sonuc=1;

        for (int i= tamsayi; i >0 ; i--) {
            sonuc*= i;

        }
        return sonuc;
    }
}
