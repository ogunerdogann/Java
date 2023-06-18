package day21_ArrayListis_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Soru3_Slayt {
    public static void main(String[] args) {

        /*
        Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
       - Kelimenin uzunlugu cift sayi ise ilk yarisini
       - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        yeni bir listeye ekleyip yazdirin.
         */

        String[] kelimeler = {"Ogün","Erdogan","Ruhr","Universität","Bochum"};
        List<String> yeniKelimeler = new ArrayList<>();
        for (String each:kelimeler)
        {
            if (each.length()%2==0){
                yeniKelimeler.add(each.substring(0,each.length()/2));
            }
            else if (each.length()%2==1){
               yeniKelimeler.add(each.substring(each.length()/2,each.length()));
        }
            else System.out.println("Hatali parametre!");
        }

        System.out.println(yeniKelimeler);
    }
}
