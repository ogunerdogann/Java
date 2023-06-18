package day13_Method_Olusturma;

import java.util.Scanner;

public class C03_methodKullanma {
    public static void main(String[] args) {
        // Kullanicidan ondan kücük iki pozitif tam sayi alip
        //faktoriyel degerlerini toplayin.
        Scanner scan=new Scanner(System.in);
        System.out.println("10'dan kücük iki adet pozitif tam sayi girin: ");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        int sonuc=C02_MethodOlusturma2.faktoriyelHesapla(sayi1)
                + C02_MethodOlusturma2.faktoriyelHesapla(sayi2);
        System.out.println(sonuc);

    }
}
