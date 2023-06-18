package Burkay_Alistirma;

import java.util.Scanner;

public class C06_SwapSoru1 {
    public static void main(String[] args) {

       // Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ilk sayiyi giriniz: ");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz: ");
        int sayi2= scan.nextInt();
        int sayi3=sayi2;
        sayi2=sayi1;
        sayi1=sayi3;
        System.out.println("Sayi1= "+sayi1+"\n"+"Sayi2= "+sayi2);


    }
}
