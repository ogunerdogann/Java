package Burkay_Alistirma;

import java.util.Scanner;

public class C03_DataCastingSoru3 {
    public static void main(String[] args) {

       // Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
       // ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi= scan.nextInt();
        byte a=(byte)sayi;
        System.out.println(a);
        System.out.println(Byte.MAX_VALUE+"\n"+Byte.MIN_VALUE); //127--(-128)

        /*
        130 yazdiginda byte alaninda 127 ye kadar gelir
        sonra byte in bas degerine gider (-128) ve oradan
        devam ederek gelir. O nedenle 130 girsen -126 sonucu alirsin!
         */


    }
}
