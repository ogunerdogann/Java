package day07_If_Statements;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir karakter girmesini istegin ve girilen karakter büyük harf ise
        bunu ekrana yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz: ");
        char karakter=scan.next().charAt(0);

        // ASCII'de A ile Z arasinda mi?

        if ('A'<= karakter && karakter<='Z'){
            System.out.println("Girilen karakter büyük harf!");
        }
        else System.out.println("Girilen karakter büyük harf degil!!");

    }
}
