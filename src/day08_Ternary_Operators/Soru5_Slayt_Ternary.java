package day08_Ternary_Operators;

import java.util.Scanner;

public class Soru5_Slayt_Ternary {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen birinci sayiyi giriniz: ");
        double sayi1= scan.nextDouble();
        System.out.println("Lütfen ikinci sayiyi giriniz: ");
        double sayi2= scan.nextDouble();
        System.out.println(sayi1<sayi2 ? sayi1 : sayi2);


    }
}
