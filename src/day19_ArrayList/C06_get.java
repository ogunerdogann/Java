package day19_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_get {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);

        System.out.println(sayilar); //[3, 5, 2]

        System.out.println(sayilar.get(0)); //3

        //son elementi yazdirin

        System.out.println(sayilar.get(sayilar.size()-1)); // 2

        // 2 elementini 12 yapin

        System.out.println(sayilar.set(2, 12)); //2. index'teki elemani 12 ile degistir. Cikti:2
        System.out.println(sayilar.set(1,7)); //1. index'teki elemani 7 ile degistir Cikti:5
        System.out.println(sayilar); //[3, 7, 12]

    }
}
