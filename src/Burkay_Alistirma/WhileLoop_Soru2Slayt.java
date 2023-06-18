package Burkay_Alistirma;

import java.util.Scanner;

public class WhileLoop_Soru2Slayt {
    public static void main(String[] args) {

        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi=scan.nextInt();
        int birler=0;
        int toplam=0;

        if (sayi>0) {
            while (sayi > birler) {

                birler = sayi % 10;
                toplam += birler;
                sayi = sayi / 10;

            }
            System.out.println("Girmis oldugunuz sayinin rakamlar toplami= "+toplam);
        }else System.out.println("Gecersiz giris!");

    }
}
