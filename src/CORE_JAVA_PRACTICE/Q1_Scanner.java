package CORE_JAVA_PRACTICE;

import java.util.Scanner;

public class Q1_Scanner {
    public static void main(String[] args) {

       /*
       Kullanicidan aldiginiz ad/soyad/yas/mail adresi/sifre bilgilerini alip
       sisteme kaydedildigini asagidaki formatta yazdirin

       ******** KAYIT BASARILI ********
       Adiniz: Tarik
       Soyadiniz: Erdogan
       Yasiniz:25
       Mail Adresiniz: tarik_23@gmail.com
       Sifreniz: 4545
       seklinde sistemimize kaydiniz basariyla tamamlanmistir.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi giriniz: ");
        String ad= scan.nextLine();

        System.out.println("Soyadinizi giriniz: ");
        String soyad= scan.nextLine();

        System.out.println("Yasinizi giriniz: ");
        int yas = scan.nextInt();

        System.out.println("Mail Adresinizi giriniz: ");
        String mail = scan.next();

        System.out.println("Sifrenizi giriniz: ");
        String sifre= scan.next();

        System.out.println("******** KAYIT BASARILI ********"+
                            "\nAdiniz: "+ad+
                            "\nSoyadiniz: "+soyad+
                            "\nYasiniz: "+yas+
                            "\nMail Adresiniz: "+mail+
                            "\nSifreniz: "+sifre+
                            "\nseklinde sistemimize kaydiniz basarili bir sekilde tamamlanmistir! :)"
                            );

        /*
            Yukarida aldiginiz bilgileri
            Kullanici: T. Yigit, 45
            seklinde yazdirin
         */


        System.out.println("Kullanici: "+ad.charAt(0)+". "+soyad+", "+yas);
    }
}
