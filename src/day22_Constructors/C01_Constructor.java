package day22_Constructors;

import day21_ArrayListis_ForEachLoop.C04_KarelerinToplami;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_Constructor {
    public static void main(String[] args) {


        /*
          Bir obje ancak bir class'tan olusturulabilir.
          Bir objeyi olusturdugumuz class ayni zamanda o objenin data türüdür.
          Her obje olusturuldugu class'in özelliklerini tasir.

          Eger bir programda ortak özelliklere sahip objeler üretmek üzere tasarladiginiz
          bir class varsa main method olmasi SART DEGILDIR!
          Bu class'lar kaliphane gibi calisir.
          Yani o class'tan ayni özelliklere sahip objeler üretmemizi saglar.

          Java'da obje olusturuldugunda ilk alacagi degerlerin ne olacagini (ilk degerleri atama: initialization)
          CONSTRUCTOR lar ile düzenleriz!


          * Constructor'larin return type 'lari yoktur.
          * Method overloading'deki gibi farkli signature'lara sahip birden fazla
          constructor olusturulabilir.
          * Constructor, class icinde, method disinda olmak zorundadir!
          * Constructor isimleri class isimleri ile ayni olmak zorundadir!
          * Static olarak tanimlanamazlar!
          * Java OOP geregi, her class obje üretmek icin olusturulmus bir
          kalip görevi görür!

         */

        Scanner scan=new Scanner(System.in);  // scan'in data türü Scanner

        List<String> isimler=new ArrayList<>(); // isimlerin data türü List'tir

        Random rnd= new Random(); //rnd'nin data türü Randomdir.

        C04_KarelerinToplami obje = new C04_KarelerinToplami();  // Objeleri bu sekilde olusturabiliyoruz.

        C02_Hemsire hemsire1= new C02_Hemsire();               // hemsire() bir constructor'dir. Ne methodtur ne de classtir.
        System.out.println(hemsire1.mesaiÜcretiHesapla(5));




    }
}
