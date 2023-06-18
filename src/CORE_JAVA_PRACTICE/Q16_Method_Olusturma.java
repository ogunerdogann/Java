package CORE_JAVA_PRACTICE;

import java.util.Scanner;

public class Q16_Method_Olusturma {
    public static void main(String[] args) {

        /*
        1- Girilen str adindaki String ifadenin bas harfini
        büyük harf yapan bir method olusturunuz.
         */
       // IlkHarfBuyukHarf();

        //***********************************************************************

        /*
        2- Girilen iki sayiyi toplayip sonucu döndüren bir method olusturunuz.
         */
       // System.out.println(IkiSayiTopla(12.23, 23.89));

        //*************************************************************************

        /*
        3- Girilen sayinin faktöriyelini hesaplayip sonucu döndüren bir method oluturunuz.
         */
        //System.out.println(FaktoriyelHesapla(6));


    }

    public static void IlkHarfBuyukHarf(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String str = scan.nextLine();

        str = str.substring(0,1).toUpperCase() + str.substring(1,str.length());
        System.out.println(str);
    }

    public static double IkiSayiTopla(double sayi1, double sayi2){

    double sonuc = sayi1+sayi2;
    return sonuc;
    }

    public static int FaktoriyelHesapla (int sayi){

        int carpim = 1;
        for (int i = sayi; i >0 ; i--) {
            carpim *= i;
        }
        return carpim;
    }
}
