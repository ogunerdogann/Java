package day02_Variable_Tanimlama;

import java.util.Scanner;

public class C04_Scanner_Ornek {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double girilensayi=scan.nextDouble();
        //Kullanicidan nasil bir sayi gelecek bilmiyoruz bu nedenle garanti olsun diye double aldik.
        System.out.println("Girilen sayinin karesi= "+girilensayi*girilensayi);

    }
}
