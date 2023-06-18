package day02_Variable_Tanimlama;

import java.util.Scanner;

public class C03_Scanner_Kullanicidan_Veri_Alma {
    public static void main(String[] args) {

        //1. Adim scanner objesi olusturun
        Scanner scan=new Scanner(System.in);

        //2. Adim Kullaniciya ne istediginizi söyleyin
        System.out.println("Lütfen isminizi giriniz");

        //3. Adim girilen bilgiyi icine koyabilecegimiz bir variable olusturun
        //olusturdugumuz scanner objesi ile uygun methodu kullanarak bilgiyi alin

        String kullaniciIsmi=scan.next();
        /*
        Scanner non-primitiv bir variable.
        Non-primitive variable larda variable dan sonra .(nokta) ya basip diger fonksiyonlari görebilirsin.
        scan.next ve scan.nextLine String döndürüyor.
        Farki .next tek kelime döndürür, .nextLine birden fazla kelime döndürür.
        diger türler icin next.Byte, next.Int gibi...
         */

        System.out.println("Girilen Isim: "+kullaniciIsmi);

        //bu koda calisirken biuden disaridan bir deger beklenecek.
        // bu nedenle console da sol kisimda kirmizi yanan bir yer olacak.
        // o deger bekleigini gösteriyor.

    }
}
