package CORE_JAVA_PRACTICE;

import java.util.Scanner;

public class Q5_if_Statements {
    public static void main(String[] args) {

        /*
        1- Ögrenci notunu harf notuna dönüstüren bir kod yaziniz
        85-100 = AA
        80-85 = BA
        75-80 = BB
        65-75 = CB
        50-65 = CC
        50 alti ise = FF
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir not giriniz: ");
        double not = scan.nextDouble();

        if (not<=100 && not >=85){
            System.out.println("AA");
        } else if (not<85 && not >=80) {
            System.out.println("BA");
        }
        else if (not<80 && not >=75) {
            System.out.println("BB");
        }
        else if (not<75 && not >=65) {
            System.out.println("CB");
        }
        else if (not<65 && not >=50) {
            System.out.println("CC");
        }
        else System.out.println("FF");

    }
}
