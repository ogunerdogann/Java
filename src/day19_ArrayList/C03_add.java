package day19_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_add {
    public static void main(String[] args) {

        //List data türü olarak primitive kabul etmez. Wrapper kullanilabilir.

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);

        System.out.println(sayilar); //[3, 5, 2]

        // 3 ile 5 arasina element olarak 7 ekleyelim.

        sayilar.add(1,7); //1. indexe 7 yi ekle

        List<Integer> ekler= new ArrayList<>();
        ekler.add(4);
        ekler.add(6);

        System.out.println(ekler); //[4, 6]

        sayilar.addAll(2,ekler);
        System.out.println(sayilar);  //[3, 7, 4, 6, 5, 2]

    }
}
