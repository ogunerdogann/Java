package day15_doWhileLoop_Scope;

import java.util.Scanner;

public class C01_WhileLoop_RakamlarToplamiBulma {
    public static void main(String[] args) {

        //While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulunuz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi=scan.nextInt();
        int toplam=0;
        int birler=0;

        while (sayi>0){

            birler=sayi%10;
            sayi=sayi/10;   //sayi/=10 da yazilabilir.
            toplam+=birler;

        }
        System.out.println("Girmis oldugunuz sayinin rakamlar toplami= "+toplam);

    }
}
