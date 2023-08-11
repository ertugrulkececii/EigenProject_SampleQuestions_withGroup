package day23_ArrayTekrarSorulari;

public class SoruCozumleri2 {
    public static void main(String[] args) {
        /*Soru 30-)

        Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
        ( mülakat sorusu )
        Örnek:
        String str="Javacokkolay"
        Yinelenen karakterler : [a, o, k]
        İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.

         */
        String str = "Javacokkolay";

        //Yinelenen karakterler : [a, o, k]

        String[] yinelenenKarakter= new String[(str.length())];

        System.out.println(yinelenenKarakterler(str, yinelenenKarakter));
    }

    public static String yinelenenKarakterler(String metin, String[] yinelenenKarakter) {



        for (int i = 0; i < metin.length(); i++) {

            for (int j = 0; j < metin.length(); j++) {

                if (metin.charAt(i)==metin.charAt(j)){


                }

            }

        }
        return metin;

    }

}



