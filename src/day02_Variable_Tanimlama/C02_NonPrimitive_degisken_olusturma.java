package day02_Variable_Tanimlama;

import java.util.Locale;

public class C02_NonPrimitive_degisken_olusturma {
    public static void main(String[] args) {

        String Isim="OgünE";
        char IlkH='O';

        System.out.println(Isim.toLowerCase()); //Isim degiskenindeki büyük harfleri kücük harf yapti!

        String metin="1.Metin"+"2.Metin"+"3.Metin"+"4.Metin"+"5.Metin"; //yanyana yazdiriyor!
        System.out.println(metin);

        /*
        primitive degiskenlerin adlari kücük harfle baslar char,boolean,double,float...
        Ancak non-primitive degiskenlerin adlari büyük harfle baslar String...
         */


        //camelCase olayi: kücük harfle baslar,sonraki kelimeler bitisik yazilir ve büyük harfle baslar.
        //ilkHarf, ogrenciNo gibi...


    }

}
