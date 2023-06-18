package day19_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("C");

        System.out.println(harfler); // [A, B, C]

        System.out.println(harfler.remove("B")); //true
        System.out.println(harfler); //[A, C]

        System.out.println(harfler.remove(0)); // A

        System.out.println(harfler); //[C]

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(18);
        sayilar.add(2);

        // Eger sadece sayilardan olusan bir list varsa remove methoduna
        //yazacagimiz sayiyi index olarak kabul eder.

        sayilar.remove(1);
        System.out.println(sayilar);  // [1, 18, 2]

        // 1'i sileleim

        Integer silinecekSayi=1;
        sayilar.remove(silinecekSayi);
        System.out.println(sayilar);  //[18, 2]
    }
}
