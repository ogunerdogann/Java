package day07_If_Statements;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu Giriniz: ");
        double not= scan.nextDouble();
        if (not>50 && not<=100 || not==50 && not<=100){
            System.out.println("Sinifi Gectin :)");

        }
        else if (not<50 && not<=100) {
            System.out.println("Malesef Kaldin :(");

        }
        else System.out.println("Gecerli bir not girmediniz!!!");


    }
}
