package CORE_JAVA_PRACTICE;

import java.util.Scanner;

public class Q4_if_statements {
    public static void main(String[] args) {

        /*
        Kullanicidan iki adet vize notu ve bir adet final notu girmesini isteyin
        Yil sonu notunu vizeler %40 finaller %60 olacak sekilde hesaplayip
        ders durumuna bu not 50'den büyük ise gectiniz tebrikler!, 50'den kücük ise maalesef kaldiniz mesajini
         asagidaki sekilde yazdiriniz.

         Ad:
         Soyad:
         1.Vize:
         2.Vize:
         Final:
         Yil Sonu notu:
         Ders Durumu:
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Adiniz: ");
        String ad = scan.nextLine();

        System.out.println("Soyadiniz: ");
        String soyad = scan.nextLine();

        System.out.println("1. Vize: ");
        double vize1 = scan.nextDouble();

        System.out.println("2. Vize: ");
        double vize2 = scan.nextDouble();

        System.out.println("Final: ");
        double finl = scan.nextDouble();

        double ysn = (((vize1+vize2)/2)*0.4+finl*0.6);

        if (ysn>=50){
            System.out.println("Ad: "+ad+
                            "\nSoyad: "+soyad+
                            "\n1. Vize: "+vize1+
                            "\n2. Vize: "+vize2+
                            "\nFinal: "+finl+
                            "\nYil Sonu Notu: "+ysn+
                            "\nDers Durumu: Tebrikler! Gectiniz!"
                            );

        }
        else System.out.println("Ad: "+ad+
                "\nSoyad: "+soyad+
                "\n1. Vize: "+vize1+
                "\n2. Vize: "+vize2+
                "\nFinal: "+finl+
                "\nYil Sonu Notu: "+ysn+
                "\nDers Durumu: Malesef kaldiniz :("
                );
    }
}
