package day02_Variable_Tanimlama;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {

        //Soru 8 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
       // degerlerini degistirin(swap).

        Scanner scan=new Scanner(System.in);
        System.out.println("sayi1 degerini giriniz(tamsayi)= ");
        int sayi1= scan.nextInt();
        System.out.println("sayi2 degerini giriniz(tamsayi)= ");
        int sayi2= scan.nextInt();

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;

        System.out.println("Sayi1 yeni deger= "+sayi1+
                "\nSayi2 yeni deger= "+sayi2
                );

    }
}
