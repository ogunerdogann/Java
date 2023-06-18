package day04_ASCII_Wrapper_Classes;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

       // Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir Harf giriniz: ");
        char girilenHarf=scan.next().charAt(0); //ilk harfini aldigimiz icin 0
        System.out.println("Girilen Harf: "+girilenHarf+
        "\nGirilen Harften sonraki 3 Harf: "+
                (char)(girilenHarf+1)+", "+
                (char)(girilenHarf+2)+", "+
                (char)(girilenHarf+3)

        //(char) castingini yapmadan yazdirmak istedigimizde cikis örnegin h harfi icin h-h1-h2-h3 oluyor
                //Bu nedenle casting yapmaliyiz


        );

    }
}
