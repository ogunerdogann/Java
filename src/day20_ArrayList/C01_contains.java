package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_contains {
    public static void main(String[] args) {

        //Uzun bir Listeyi Java'da List olarak kaydetmek istersek;
        // tek tek eklemek istemezseniz
        // pratik olarak bir array olusturup,
        //loop ile tüm elementleri List'e ekleyebiliriz.

        int[] arr={2,3,5,4,3,6,7,5,4,3,2,5,6,8,6,5,1};
        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar);

        // Liste'de element olarak 3 var mi?

        System.out.println(sayilar.contains(3)); //true
        System.out.println(sayilar.contains(9)); //false

        // set methodu
        sayilar.set(0,23); //0. index'teki elemani 23 olarak güncelle
        System.out.println(sayilar);

        // clear methodu
        //sayilar.clear(); //hepsini siler

        // removeAll methodu
    }
}
