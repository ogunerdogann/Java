package day25_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_Mutable_Immutable {
    public static void main(String[] args) {

        /*
           String ve Wrapper class'lar immutable olduklari icin degistirilemezler.
           Ancak Array ve List mutable olduklari icin
           atama yapmasak da method kullaninca degerleri degisir.

           mutable: degitirilebilir
           immutable: degistirilemez
         */

        String str= "Java gün gectikce daha da keyifli oluyor";
        str.substring(5);
        str.toLowerCase();
        str.startsWith("Java");

        System.out.println(str); //Java gün gectikce daha da keyifli oluyor

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(9);

        System.out.println(sayilar); //[5 9]

        sayilar.set(0,7);
        sayilar.remove(1);

        System.out.println(sayilar); //[7]

    }
}
