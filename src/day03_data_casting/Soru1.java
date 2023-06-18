package day03_data_casting;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        //Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen birinci tamsayiyi giriniz: ");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen ikinci tamsayiyi giriniz: ");
        int sayi2= scan.nextInt();
        System.out.println("Lütfen ücüncü tamsayiyi giriniz: ");
        int sayi3= scan.nextInt();
        double ort= (double)(sayi1+sayi2+sayi3)/3;
        System.out.println("Ortalama= "+ort);

    }
}
