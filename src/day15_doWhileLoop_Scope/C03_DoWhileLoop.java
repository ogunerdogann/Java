package day15_doWhileLoop_Scope;

import java.util.Scanner;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        /*
         While loop'ta bitis sarti kontrolü her zaman body'den bir fazla calisir.
         While loop'ta kullanicidan alacagimiz degerlere önce bizim deger atamamiz gerekir bu da
         bazen hatalara sebep olur.
         */


        //Kullanicidan toplanmak üzere sayilar alin.
        //Kulaniciya bitirmek icin 0'a basmasini söyleyin.
        //Kullanici 0'a bastiginda 0 haric kac sayi girildigini ve
        //toplamlarini yazdirin.

        Scanner scan=new Scanner(System.in);

        int girilenSayi=1;      // 0 verdigimizde program calismaz!
        int toplamm=0;
        int sayiAdedi=0;

        while (girilenSayi != 0){

            System.out.println("Toplanmak üzere tam sayi giriniz: "
                    +"\nBitirmek icin 0'a basiniz!");
            girilenSayi= scan.nextInt();

            if (girilenSayi != 0) {
                toplamm+=girilenSayi;
                sayiAdedi++;
            }

        }

        System.out.println("Girilen "+sayiAdedi+" sayinin toplami= "+toplamm);
    }
}
