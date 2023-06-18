package day08_Ternary_Operators;

import java.util.Scanner;

public class Soru1_Ternary_Slayt {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        // “Sayi 5’in tam kati” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        double sayi=scan.nextDouble();

        System.out.println(sayi%5==0 ? "5'in tam kati!" : "5'in tam kati degil!!");
    }
}
