package Burkay_Alistirma;

import java.util.Scanner;

public class C01_ifElseStatementSoru1 {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen birinci kenar uzunlugunu giriniz: ");
        double kenar1= scan.nextDouble();
        System.out.println("Lütfen ikinci kenar uzunlugunu giriniz: ");
        double kenar2= scan.nextDouble();
        System.out.println("Lütfen ücüncü kenar uzunlugunu giriniz: ");
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3){
            System.out.println("ESKENAR ÜCGEN");

        }
        else System.out.println("Eskenar degil!");


    }
}
