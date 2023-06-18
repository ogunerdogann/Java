package day09_10_String_Manipulations;

import java.util.Scanner;

public class Soru5_Slayt {
    public static void main(String[] args) {

       // Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
      //          - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
      // yazdirin
      //          - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
       // harflerle yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adinizi giriniz: ");
        String ad= scan.nextLine();
        System.out.println("Lütfen soyadinizi giriniz: ");
        String soyad= scan.nextLine();
        ad=ad.toLowerCase();
        soyad=soyad.toLowerCase();
        int adu=ad.length();
        int soyadu=soyad.length();

        if (adu>soyadu){
            System.out.println(ad.substring(0,1).toUpperCase()+ad.substring(1)+" "+soyad.substring(0,1).toUpperCase()+soyad.substring(1));
        } else if (soyadu>adu) {
            System.out.println(ad.substring(0,1).toUpperCase()+ad.substring(1)+" "+soyad.toUpperCase());
        }else if (adu==soyadu){
            System.out.println("Ad ve soyad esit uzunlukta!");
        }

    }
}
