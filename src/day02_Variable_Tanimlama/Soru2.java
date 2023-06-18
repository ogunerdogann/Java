package day02_Variable_Tanimlama;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

       // Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
       // yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ilk sayiyi giriniz: ");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz: ");
        double sayi2=scan.nextDouble();
        System.out.println("Girmis oldugunu sayilarin toplami: "+(sayi1+sayi2) + "Girmis oldugunuz sayilarin carpimi: " +sayi2*sayi1);

    }
}
