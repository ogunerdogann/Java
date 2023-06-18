package day02_Variable_Tanimlama;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
       // girilen bilgiler : J Doe, 44

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adinizi, soyadinizi, yasinizi giriniz."+
                "\nHer girdiginiz bilgiden sonra entera basiniz."
        );
        char isimIlkHarf=scan.nextLine().charAt(0);
        /*
        Scanner methodlarinda next.char yok.
        Bunun icin önce kullanicinin girisine göre next() veya nextLine() yazip
        sonra charArt() yazariz
        parantez icindeki 0 almak istedigimiz bir char`in indexidir.
        ve kodlamada index 0 dan baslar.
         */
        String soyIsim=scan.nextLine();
        double yas= scan.nextDouble();
        System.out.println("Girilen Bilgiler: "+isimIlkHarf+ " " + soyIsim+", " + yas );
    }
}
