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
        // Array tanımlama
        String[] array = { "Python", "JAVA", "PHP", "Perl", "C#", "C++" };
//============================*******2.cozum*******=====================
// ArrayList oluşturma
        ArrayList<String> arrayList = new ArrayList<String>();

// Array'in elemanlarını ArrayList'e ekleme
        for (String element : array) {
            arrayList.add(element);
        }

// ArrayList'i yazdırma
        System.out.println(arrayList);


        //==========================******listi Array cevirme***********==================


        // String tipinde bir ArrayList oluşturma
        ArrayList<String> arrayListi = new ArrayList<String>();
        arrayList.add("Python");
        arrayList.add("JAVA");
        arrayList.add("PHP");
        arrayList.add("Perl");
        arrayList.add("C#");
        arrayList.add("C++");

// ArrayList'i String[] tipinde bir array'e çevirme
        String[] arrr = arrayListi.toArray(new String[0]);

// Array'i yazdırma
        System.out.println(Arrays.toString(arrr));
    }
}



