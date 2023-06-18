package day04_ASCII_Wrapper_Classes;

public class C02_Wrapper_Classes {
    public static void main(String[] args) {

        //non-primitive data türlerinin hazir methodlari varken
        //primitive data türlerinin hazir methodlari yoktur
        //Java primitive data türleri icin kolayca gecis yapabilecekleri
        // non-primitive data türleri olusturulmustur

        /*

        int=====>Integer
        byte====>Byte
        char====>Character
        boolean==>Boolean

        Harflerin büyük olmasina dikkat!

         */

        Integer sayi=10;
        //int variable a atadigimiz degerleri atayabiliyoruz
        //arti olarak hazir methodlari var

        //variable olusturmadan da bazi methodlari kullanabiliyoruz

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        String sonucStr="345";

        //castingi burada yapamayiz birisi non-primitive, birisi primiteive.
        //Burada Wrapper Class lar imdadimiza yetisir

        int sonuc=Integer.parseInt(sonucStr);  //cok kullanilir
        System.out.println(sonuc+10);

        sonuc=Integer.valueOf(sonucStr);
        System.out.println(sonuc+10);

        //Bu iki yöntemle String bir ifadeyi int a cevirdik

        char krk='3';
        System.out.println(Character.isDigit(krk));  //true döndürür krk bir digit mi
        System.out.println(Character.isLetter(krk));  //krk harf mi false döndürür

        System.out.println(Character.isAlphabetic('9')); // false döndürür

    }
}
