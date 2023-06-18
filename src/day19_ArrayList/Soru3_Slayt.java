package day19_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Soru3_Slayt {
    public static void main(String[] args) {

        //Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
        //kismini list olarak bize donduren bir method olusturun

        List<String> isimList = new ArrayList<>();
        isimList.add("Ogün");
        isimList.add("Erdogan");
        isimList.add("Biyomedikal");
        System.out.println(isimList.size());
        System.out.println(isimList.get(2));

        System.out.println(istenmeyenElemaniSil(isimList, "ü"));
    }

    public static List<String> istenmeyenElemaniSil(List<String> liste, String istenmeyenHarf){

        List<String> newList = new ArrayList<>();

        for (int i = 0; i <liste.size() ; i++) {

            if (liste.get(i).contains(istenmeyenHarf)){   // listenin tüm elemanlarini kontrol ediyorum.

               String eleman =  liste.get(i).replace(istenmeyenHarf,"");
               //Burada listenin elemanini aliyorum (String), istenmeyen harfi hiclikle degistiriyorum. (String manipulations)
               newList.add(eleman); // elemanin son halini listeye ekliyorum.
            }
            else {
                newList.add(liste.get(i)); // eger if de kosulan sart yok ise elemanin kendisini ekliyorum. (Böyle yapmazsan bos liste cikariyor!)
            }
        }
        return newList ;
    }
}
