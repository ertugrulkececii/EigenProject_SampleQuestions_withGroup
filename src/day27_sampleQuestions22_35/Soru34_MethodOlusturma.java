package day27_sampleQuestions22_35;

public class Soru34_MethodOlusturma {
    /*
    Soru 34-)
     Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların toplamını yazdıran
     bir Method yazın.

        Örnek
        String str : ade1r4d3
        Int toplam : 8
        İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
                  Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz
     */

    public static void main(String[] args) {
String metin= "ade1r4d3";
        metindekiRakamlariTopla(metin);
    }

    public static void metindekiRakamlariTopla(String metin) {



       metin= metin.replaceAll("\\D","");

        int toplam=0;
        int metindekiRakamlar=Integer.parseInt(metin);
        System.out.println(metindekiRakamlar);
        for (int i = 0; i < metin.length(); i++) {
            int birlerBasamagi=0;
            birlerBasamagi=metindekiRakamlar%10;
            toplam +=birlerBasamagi;
            metindekiRakamlar/=10;



        }
        System.out.println("Verilen metindeki rakamlar toplami ="+ toplam);
    }
}
