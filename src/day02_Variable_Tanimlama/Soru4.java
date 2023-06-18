package day02_Variable_Tanimlama;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
        //yazdirin.

         Scanner scan=new Scanner(System.in);
        System.out.println("Dikdörtgenin birinci kenar uzunlugunu giriniz: ");
        double kenar1=scan.nextDouble();
        System.out.println("Dikdörtgenin ikinci kenar uzunlugunu giriniz: ");
        double kenar2=scan.nextDouble();
        System.out.println("Dikdörtgenin Alani= "+kenar2*kenar1);


    }
}
