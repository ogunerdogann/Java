package CORE_JAVA_PRACTICE;

import java.util.Scanner;

public class Q2_Data_Casting_String_Manipulation {
    public static void main(String[] args) {

        /*
        1- Int olarak verilen 3 sayinin toplamini double olarak yazdirin
        ipucu: double>float>long>int>short>byte
         */

        int a=3, b=5, c=10;
        double toplam=a+b+c;
        System.out.println(toplam);

        /*
        2- Kullanicidan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
        Girdiginiz Harf:
        Girdiginiz harften sonraki üc harf:
        seklinde yazdirin.
        ipucu:char
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz: ");
        char harf = scan.nextLine().charAt(0);

        System.out.println("Girdiginiz Harf: "+harf+
                            "\nGirdiginiz Harften sonraki üc Harf: "+(char)(harf+1)+" "+(char)(harf+2)+" "+(char)(harf+3)
                            );


        /*
        3- Kullanicidan iki double sayi alin ve ilk sayiyi ikinci sayiya bölüp
        sonucu tam sayi olarak yazdirin.
         */

        System.out.println("Lütfen bir sayi giriniz(ondalikli): ");
        double sayi1= scan.nextDouble();

        System.out.println("Lütfen ikinci sayiyi giriniz(ondalikli): ");
        double sayi2 = scan.nextDouble();

        System.out.println("bölüm tam sayi olarak: "+(int)(sayi1/sayi2));
    }
}
