package day27_sampleQuestions22_35;

public class Soru27_AsciiYazdir {
    public static void main(String[] args) {
       /*
        Soru 27-) 'a' ile 'z' arasındaki karakterlerin ASCII değerlerini yazdıran bir Java programı yazın

        ipucu: For Loop ve Char kullanarak çözebilirsiniz.
        örnek:
        Ascii value of a = 97
        Ascii value of b = 98
        Ascii value of c = 99
        Ascii value of d = 100
*/
        char bas = 'a';

        for (int i = 'a'; i <= 'z'; i++) {

            System.out.println(bas + " ín ASCII degeri= " + i);

            bas += 1;
        }
    }

}
