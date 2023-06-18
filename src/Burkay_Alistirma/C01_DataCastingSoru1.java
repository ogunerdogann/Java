package Burkay_Alistirma;

import java.util.Scanner;

public class C01_DataCastingSoru1 {
    public static void main(String[] args) {

       // Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen birinci sayiyi giriniz: ");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz: ");
        int sayi2= scan.nextInt();
        System.out.println("Lütfen ücüncü sayiyi giriniz: ");
        int sayi3= scan.nextInt();
        double ort=(double)(sayi1+sayi2+sayi3)/3;
        System.out.println(ort);

    }
}
