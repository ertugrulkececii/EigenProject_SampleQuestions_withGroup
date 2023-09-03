package day01_grupClaismasi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ornek26 {
    public static void main(String[] args) {


    /*26-----
    Array i ARRAYLIST e ceviren Java Kodunu yaziniz.
    Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

    Beklenen Cikti:
    [Python, JAVA, PHP, Perl, C#, C++]
    */

        String arr[]={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        List<String> list=new ArrayList<>(Arrays.asList(arr));

        System.out.println("Beklenen Cikti: \n"+list);
    }
}



