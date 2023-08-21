package day01_grupClaismasi;

public class ornek1 {
    public static void main(String[] args) {


       /* 1 den 10 a kadar her satirda bir artirarak asagidaki sekli olusturan Java kodunu yaziniz.

                Beklenen Sekil:

        1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
        12345678910
                */

        for (int i = 0; i <= 10; i++) { //satir icin

            for (int j = 1; j <=i ; j++) { //sutun icin
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
