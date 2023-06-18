package day02_Variable_Tanimlama;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("Cemberin yaricap degerini giriniz: ");
        double yaricap= scan.nextDouble();
        double alan=Math.PI*Math.pow(yaricap,2);
        double cevre=2*Math.PI*yaricap;
        System.out.println("Cemberin Alani= "+alan+
                "\nCemberin Cevresi= "+cevre
                );
    }
}
