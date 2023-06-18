package day07_If_Statements;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Ücgenin 1. Kenar Uzunlugunu Giriniz: ");
        double kenar1= scan.nextDouble();
        System.out.println("Lütfen Ücgenin 2. Kenar Uzunlugunu Giriniz: ");
        double kenar2= scan.nextDouble();
        System.out.println("Lütfen Ücgenin 3. Kenar Uzunlugunu Giriniz: ");
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3 && kenar1>0){
            System.out.println("ESKENAR ÜCGEN!!");
        }

        else System.out.println("Eskenar Ücgen Degil!!");


    }
}
