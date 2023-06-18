package day04_ASCII_Wrapper_Classes;

import java.util.Scanner;

public class C03_Matematiksel_Ifadeler {
    public static void main(String[] args) {

        //islem önceligi sirasina Java dikkat eder
        //islem önceligi ayni derecee olan iki ifade varsa önce soldaki yapilir

        // Modulus islemi bir bölme isleminde kalan sayiyi verir
        // bir sayinin baska bir sayiyla bölümünden kalanin kac oldugunu veya
        // Bir sayinin birler basamagindaki degeri bununla bulabiliriz

        //örnek: Kullanicidan 3 basamakli bir sayi alin ve sayinin rakamlar toplamini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 3 basamakli pozitif bir sayi giriniz: ");
        int sayi= scan.nextInt();  //girilen sayi
        int birlerbasamagi=sayi % 10;
        System.out.println(birlerbasamagi);
        int rakamlartoplami=birlerbasamagi;
        sayi=sayi/10; //5 ten kurtulduk int olduguna dikkat
        int onlarbasamagi=sayi%10;
        rakamlartoplami=rakamlartoplami+onlarbasamagi;
        sayi=sayi/10;
        int yuzlerbasamagi=sayi%10;
        rakamlartoplami=rakamlartoplami+yuzlerbasamagi;
        System.out.println(rakamlartoplami);



    }
}
