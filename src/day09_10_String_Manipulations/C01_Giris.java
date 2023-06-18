package day09_10_String_Manipulations;

import java.util.Locale;

public class C01_Giris {
    public static void main(String[] args) {

        /*
        Verilen bir String'i hazir methodlari kullanarak degistirme
        islemine denir.
         */

        String str="Java Candir";
        System.out.println(str.toUpperCase()); //yazdirirken atama yapmamiza gerek yok! JAVA CANDIR ciktisi alinir.
        System.out.println(str); //Java Candir
        str=str.toUpperCase(); // Kalici olarak degisiklik yapmak istiyorsak atama yapmamiz gerekir!
        System.out.println(str); // JAVA CANDIR
        System.out.println(str.toLowerCase()); //java candir

        /*
        Simdi str degiskenini türkce karakterleri göz önünde bulundurarak
        degistirelim. Mesela kücük i harfi olsun.
         */

        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR")));
    }
}
