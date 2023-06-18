package day03_data_casting;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

       // Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        // ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        Integer sayi= scan.nextInt();
        sayi=Integer.max(-127,127);
        System.out.println(sayi);




    }
}
