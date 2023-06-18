package Burkay_Alistirma;

import java.util.Scanner;

public class C04_DataCastingSoru4 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen birinci sayiyi giriniz: ");
        double sayi1=scan.nextDouble();
        System.out.println("Lütfen ikinci sayiyi giriniz: ");
        double sayi2=scan.nextDouble();
        double sonuc=(int)(sayi1/sayi2);
        System.out.println(sonuc);

    }
}
