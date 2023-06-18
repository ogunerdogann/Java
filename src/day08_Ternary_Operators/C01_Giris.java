package day08_Ternary_Operators;

import java.util.Scanner;

public class C01_Giris {
    public static void main(String[] args) {

         /*
         Ternary operators if else ile yapabilecegimiz
         basit islemleri daha basit bir sekilde yazmamiza
         yardimci olur.
          */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        double a= scan.nextDouble();
        if (a>0) {a*=10;} else {a+=10;}
        // if ile islemi böyle yaziyoruz
        System.out.println(a);

        a=a>0 ? a*10 : a+10; // ? if görevini görür true ise bir sonraki islemi yapar.
        System.out.println(a);
        // : isareti ise else görevini görür.
    }
}
