package day18_MultiDimensionalArrays;

import java.util.Arrays;

public class C02_StringiArrayaCevirme {
    public static void main(String[] args) {

        // Bir String'i istedigimiz parcalara ayirmak icin kullanilir!

        String str="Java candir can buna itirazi olan var mi?";

        // Str kac kelimedir?

        String[] kelimeler= str.split(" "); // Space olan yerlerden parcalara ayir. Array döner. O nedenle array'e atamamiz gerek.
        System.out.println(Arrays.toString(kelimeler)); // bosluklardan parcalayip her kelimeyi bir eleman olarak array'e atadi!

        System.out.println("Kelime Sayisi: "+kelimeler.length); //3

        // En uzun kelime kac harflidir?

        int enUzunKelimeLength=kelimeler[0].length(); //karsilastirmak icin bir tanesini seciyoruz

        for (int i = 0; i < kelimeler.length; i++) {
            if (kelimeler[i].length()>enUzunKelimeLength){
                enUzunKelimeLength=kelimeler[i].length();

            }
        }

        System.out.println("En uzun kelimenin karakter sayisi: "+enUzunKelimeLength);

        // Bir String'i karakterlerine ayirmak istersek

        String[] karakterler=str.split("");
        System.out.println(Arrays.toString(karakterler));
        System.out.println("Cümledeki karakter sayisi: "+karakterler.length);

        //split methodu hangi karakterden ayirmak istiyorsak okarakterleri bulur, onlari yok eder ve o karakterlerden
        // itibaran yeni eleman olarak atar!

    }
}
