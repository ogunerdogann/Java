package day09_10_String_Manipulations;

public class C02_equals_Methodu {
    public static void main(String[] args) {

        String str1="Java";
        String str2="JAVA";
        String str3="java";
        String str4="JaVa";

        System.out.println(str1.equals(str3)); //str1 str3 e esit mi? Cikti:false
        System.out.println(str4.equals(str2)); //str4 str2 ye esit mi? Cikti:false

        System.out.println(str1.equalsIgnoreCase(str3)); //Harflerin esitlik durumunu gözardi et! Cikti:true
        System.out.println(str4.equalsIgnoreCase(str2)); //Harflerin esitlik durumunu gözardi et! Cikti:true

        /*
        equals.IgnoreCase() durumunda mesela kelime aynidir ancak büyük veya kücük harflerde farkliliklar vardir.
        Büyük kücük harf durumu önemli degilse, sadece yazilan kelimenin dogrulugu önemliyse bu fonksiyonu kullaniriz!
         */

        String str5="java";
        String str6="Ja";
        String str7="va";
        String str8=str6.concat(str7);
        System.out.println(str8); //Java
        System.out.println(str1==str5);  //Java=Java  Cikti: true
        System.out.println(str1==str8);  //Java=Java  Cikti: false

        /*
        == ile Stringleri karsilastirirsak hem metin degerine hem referanslarina bakar.
        equals ile Stringleri karsilastirirsak sadece metin degerleerine bakar.

        == ile Stringleri karsilastirdigimizda bekledigimizden farkli sonuclar olabilir.
        Bu yüzden iki String'i karsilastiracaksak == degil equals kullaniriz.
         */


    }
}
