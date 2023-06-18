package Burkay_Alistirma;

import java.util.Scanner;

public class C01_ifElseStatements_Soru1_SOR {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
       // olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz: ");
        //String cins=scan.next();                                 Calismadi!
        char cins=scan.next().charAt(0);
        System.out.println("Lütfen yasinizi giriniz: ");
        int yas= scan.nextInt();

       if (cins=='k' && yas>=60){
           System.out.println("Emekli Olabilirsiniz");


       } else if (cins=='k' && yas<60) {
           System.out.println("Emekli olmak icin "+(60-yas)+" yil daha calismaniz gerekir");

       } else if (cins=='e' && yas>=65) {
           System.out.println("Emekli olabilirsiniz");

       } else if (cins=='e' && yas<65) {
           System.out.println("Emekli olmak icin "+(65-yas)+" yil daha calismaniz gerekir");

       }
       else System.out.println("Hatali ifade girdiniz!");


    }
}
