package Burkay_Alistirma;

import java.util.Scanner;

public class C02_ifElseStatementSoru2 {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz: ");
        double not= scan.nextDouble();

        if (not>=50){

            System.out.println("Sinifi Gectiniz");
        }

        else System.out.println("Malesef Kaldiniz");

    }
}
