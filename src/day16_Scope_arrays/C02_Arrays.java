package day16_Scope_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String[] isimler={"Ogün","Tarik","Aytug"};
        int[] sayilar={3,4,5,6,7,8,9,10};
        char karakterler[]={'e','4','#'};  // böyle de yazilir ama IntelliJ begenmedi bunu :)

        // Array non-primitive data türlerindendir.
        // Eger arrayi'i liste seklinde olusturmayip, new keyword kullaniyorsak
        // uzunlugunu yazmak zorundayiz!

        String[] arr=new String[5];

        // Bir array tanimlanan uzunluktan daha fazla veya az eleman alamaz!!

        //Bir array'i yazdirmak istersek
        System.out.println(isimler); //referans cikarir.
        // Array'ler direk yazdirilamazlar!

        System.out.println(Arrays.toString(isimler));  // Bu sekilde ciktiyi verir!
        System.out.println(Arrays.toString(arr)); //[null null null null null] 5 tane null verir!(default degerler)

        int[] a=new int[7];
        System.out.println(Arrays.toString(a)); // 7 tane default deger yazdirir(Burada 0)

        // array'deki elementler nasil ulasiriz? index ile.

        a[0]=4; // a matrix'inin 1. elementinin yeni degeri 4 oldu!
        a[3]=7; // a matrix'inin 4. elementinin yeni degeri 7 olur!
        a[5]=8; // a array'inin 5. index'inin yeni degeri 8 oldu!

        // sayilar array'inin 4. index'indeki elementi yazdirin

        System.out.println(sayilar[4]); // 7

        // isimler array'inin 1. index'indeki ismi yazdirin

        System.out.println(isimler[1]); //Tarik

    }
}
