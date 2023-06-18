package day08_Ternary_Operators;

import java.util.Scanner;

public class Soru4_Ternary_Slayt {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz: ");
        double not= scan.nextDouble();
        System.out.println(not>=0 && not<50 ? "Maalesef Kaldin :("
                : not>=50 && not<=100 ? "Sinifi Gectin :)"
                :"Gecersiz not Girisi!");

    }
}
