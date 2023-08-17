package day01_grupClaismasi;

public class ornek2 {


    /*5-----
    Asagidaki elmas deseni gosteren java kodunu yaziniz.
    Test Data:
    Yarim elmas uzunlugu : 7
    Beklenen sekil:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
    */
    public static void main(String[] args) {
String star="*";

        for (int i = 0; i <= 3; i++) {
           star+="*";
            for (int j = 0; j < i; j++) {

            }
            System.out.println("*"+star+"*");
        }
    }
}
