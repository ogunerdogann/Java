package day07_If_Statements;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen a sayisini giriniz: ");

         int a= scan.nextInt();

        System.out.println("Lütfen b sayisini giriniz: ");
         int b=scan.nextInt();

        if (a<b){
            System.out.println("a b den kücüktür");
        }
        else if (a>b) {
            System.out.println("a b den büyüktür");

        }
        else {
            System.out.println("a b ye esittir");
        }

    }
}
