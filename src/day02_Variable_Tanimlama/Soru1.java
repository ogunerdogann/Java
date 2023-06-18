package day02_Variable_Tanimlama;

import java.util.Scanner;

public class Soru1 {

    public static void main(String[] args) {

        //Soru 1- Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla
       //yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        float sayi1=scan.nextFloat();
        System.out.println("Lütfen bir kelime giriniz: ");
        String kelime= scan.next();
        System.out.println("girdiginiz sayi: "+sayi1);
        System.out.println("Girmis oldugunuz Kelime:"+kelime);


    }

}
