package day19_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayList {
    public static void main(String[] args) {

        /*
          Array List uzunlugu esnek bir listedir.
          Array altyapisini kullanir ancak eklme ve silme gibi islemlerde daha avantajlidir.

         */

        int[] arr={3,4};
        List<String> harfler = new ArrayList<>(); // bos bir list olusturur.
        System.out.println(harfler); //[]

        harfler.add("s");
        harfler.add("l");
        harfler.add("a");

        System.out.println(harfler); //[s, l, a]


    }
}
