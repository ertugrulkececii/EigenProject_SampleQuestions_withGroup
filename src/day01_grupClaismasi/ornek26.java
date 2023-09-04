package day01_grupClaismasi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ornek26 {
    /*26-----
   Array i ARRAYLIST e ceviren Java Kodunu yaziniz.
   Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

   Beklenen Cikti:
   [Python, JAVA, PHP, Perl, C#, C++]
   */
    public static void main(String[] args) {
/*
        String[] arr={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        ArrayList<String> arrayList=new ArrayList<>(Arrays.asList(arr));

        System.out.println("Beklenen cikti : "+arrayList);

 */

//****************************2.cozum************************************


       /* ArrayList<String> arrayList=new ArrayList<>();
        String[] arr={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        for (String each:arr ) {
            arrayList.add(each);

        }
        System.out.println(arrayList);

        */
      //  *************************************3.cozum*****************************8
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Python");
        arrayList.add("JAVA");
        arrayList.add("PHP");
        arrayList.add("Perl");
        arrayList.add("C#");
        arrayList.add("C++");

        String[] arr=arrayList.toArray(new String[arrayList.size()]);

        System.out.println(Arrays.toString(arr));

    }
}



