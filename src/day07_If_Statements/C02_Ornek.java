package day07_If_Statements;

import java.util.Scanner;

public class C02_Ornek {
    public static void main(String[] args) {

        /*
        Kullanicinin girdigi 3 basamakli bir sayinin
        3 ile bölünebilme durumunu gösteren, bölünebiliyor
        ise bölümün sonucunu veren programi yaziniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 basamakli bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int girilenDeger = sayi;
        int birler = sayi % 10;
        int toplam = birler;
        sayi = sayi / 10;
        int onlar = sayi % 10;
        toplam = toplam + onlar;
        sayi = sayi / 10;
        int yuzler = sayi % 10;
        toplam = toplam + yuzler;

        if (-1000<girilenDeger && girilenDeger<1000 && girilenDeger>100 || girilenDeger<-100) {

            if (toplam % 3 == 0) {

                System.out.println("Girdiginiz sayi 3 ile bölünebilir!");
                System.out.println("Sonuc= " + girilenDeger / 3);

            } else System.out.println("Girmis oldugunuz sayi 3 ile bölünemez!");

        }
        else System.out.println("3 Basamakli bir sayi girmediniz!!!");
    }
}
