package day20_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C02_equalsMethodu {
    public static void main(String[] args) {

        List<Integer> sayilar1=new ArrayList<>();
        sayilar1.add(3);
        sayilar1.add(8);
        sayilar1.add(1);
        sayilar1.add(2);



        List<Integer> sayilar2=new ArrayList<>();
        sayilar2.add(3);
        sayilar2.add(1);
        sayilar2.add(8);
        sayilar2.add(2);
        sayilar2.add(5);

        System.out.println(sayilar1.equals(sayilar2)); // esit  olup olmadigini kontrol eder. Cikti:false
        sayilar2.remove(4); //uymayan elemani cikardik ama yine de false verir cünkü;

        //equals hem elementleri hem de index'leri kontrol eder.
        // Listleri siralamak icin Collections kullanilir.

        Collections.sort(sayilar1);
        Collections.sort(sayilar2);
        System.out.println(sayilar1.equals(sayilar2)); //true
    }
}
