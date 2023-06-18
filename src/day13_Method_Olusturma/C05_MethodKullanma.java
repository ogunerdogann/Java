package day13_Method_Olusturma;

import java.util.Scanner;

public class C05_MethodKullanma {
    public static void main(String[] args) {
        //Verilen bir String'in Palindrome olup olmadigini yazdirin
        // Palindrom: Düzden ve tersten ayni sekilde yazilan (madam, ada, 12321, kabak...)

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz: ");
        String metin= scan.nextLine();
        String tersmetin=C04_StringiTerseCevirme.terscevirme(metin);
        if (metin.equals(tersmetin)) System.out.println("Palindrom!!");
        else System.out.println("Palindrom degil!!!");
    }
}
