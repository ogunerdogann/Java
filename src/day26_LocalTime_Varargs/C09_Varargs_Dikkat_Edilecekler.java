package day26_LocalTime_Varargs;

import java.util.Arrays;

public class C09_Varargs_Dikkat_Edilecekler {
    public static void main(String[] args) {

       topla(2,3,4,5,6,7); //[2, 3, 4, 5, 6, 7] [3, 4, 5, 6, 7] Istenen islem sonucu: 50

        // Verilen sayilardan ilki haric digerlerini toplasin
        // sonra toplam ile ilk sayiyi carpip yazdirsin.

        //Dikkat edilecekler 1

        // 2 method icin her ne kadar parametre sayisi farkli olsa da
        //varargs'in yapisindan dolayi int a, int...b ile int...b
        //arasinda argument kabulü acisindan fark yoktur

        // Dikkat Edilecekler 2

        // son sayiyi ayirmak istersek?
        // Varargs eklenen tüm parametreleri kendisi almak ister-
        // Bundan ötürü bir method'da parametre olarak varargs kullanilacaksa
        // EN SON PARAMETRE OLARAK KULLANILMALIDIR1

        /*

         Dikkat Edilecekler 3

         Bir method'da parametre olarak 2 varargs KULLANILAMAZ!!
         Cünkü varargs son parametre olmalidir!
         2 Varargs olursa biri sonuncu olamayacagi icin CTE verir!

         */

    }
/*
    public static void topla(int... a){
        System.out.println(Arrays.toString(a));

        int toplam=0;

        for (int each:a
        ) {
            toplam += each;
        }
        System.out.println("Toplam: "+toplam);
    }

    Dikkat Edilecekler 1
    Her ne kadar iki method icin parametre sayisi farkli olsa da
    Varargs'in yapisindan dolayi int a, int...b ile int...b arasinda
    argüment kabulü acisindan fark yoktur.
 */

    public static void topla(int c, int... a){
        System.out.println(Arrays.toString(a));

        int toplam=0;

        for (int each:a
        ) {
            toplam += each;
        }
        System.out.println("Istenen islem sonucu: "+toplam*c);
    }

}
