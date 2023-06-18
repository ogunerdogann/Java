package day08_Ternary_Operators;

import java.util.Scanner;

public class Soru6_Ternary_Slayt {
    public static void main(String[] args) {

        /*
        Kullanicidan bir tam sayi alip
        mutlak degerine cevirin ve yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        double sayi= scan.nextDouble();

        System.out.println(sayi>0 ? sayi*=1 : sayi*(-1));

        /*
        Ternary operatörlerini kullanirken ya sout kullanip sisteme yazdirirken
        ya da bir degere atama yapilirken kullanilir
         */

        sayi=sayi>0 ? sayi*1 : sayi*(-1); //atama yaparak

        //if olsaydi atama yapip = kullanacaktik ama burada bu sekil yaziyoruz = e gerek yok

    }
}
