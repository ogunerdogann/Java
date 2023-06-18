package day02_Variable_Tanimlama;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {

        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).


        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi1´i giriniz(tamsayi)= ");
        int sayi1= scan.nextInt();
        System.out.println("Sayi2´yi giriniz(tamsayi)= ");
        int sayi2= scan.nextInt();



       // sayi2=sayi1;  //simdi sayi1 in degerini sayi2 ye attim ancak sayi1 e yeni degerini atamadim. O nedenle ücüncü bir degiskene ihtiyacim var.

        int temp=0;   //gecici 3. degisken
        temp=sayi2;   //2. sayiyi yedekledim
        sayi2=sayi1;  //1. sayinin degerini 2. sayiya attim
        sayi1=temp;   //yedekledigim sayi2 degerini sayi 1 e attim

        System.out.println("sayi1 yeni deger= "+sayi1+
                "\nsayi2 yeni deger= "+sayi2
                );

    }
}
