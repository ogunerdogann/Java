package Burkay_Alistirma;

import java.util.Scanner;

public class C06_SwapSoru2 {
    public static void main(String[] args) {

        //Soru 8 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
        //degerlerini degistirin(swap)

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ilk sayiyi giriniz: ");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz: ");
        int sayi2= scan.nextInt();
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("Sayi1= "+sayi1+"\n"+"Sayi2= "+sayi2);

    }
}
