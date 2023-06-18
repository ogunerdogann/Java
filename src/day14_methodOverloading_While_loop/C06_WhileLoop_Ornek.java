package day14_methodOverloading_While_loop;

import java.util.Scanner;

public class C06_WhileLoop_Ornek {
    public static void main(String[] args) {

        //Kullanicidan bir sifre isteyin.
        //Asagidaki sartlari saglayana kadar
        //her seferinde hatalari söyleyip yeni sifre isteyin
        //sartlari saglayan sifre oldugunda
        //"5. denemenizde basarili sifre olusturuldu"
        //seklinde aciklama yazin
        // * Ilk harf kücük harf olmali
        // * Son harf büyük harf olmali
        // * bosluk icermemeli
        // * 8 karakter veya daha uzun olmali

        Scanner scan=new Scanner(System.in);

        String sifre= "";
        int flag=0;
        int denemeSayisi=0;

        while (flag!=4){
            System.out.println("Sifrenizi giriniz: ");
            sifre= scan.nextLine();
            flag=0;
            if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
                flag++;
            }else System.out.println("Ilk karakter kücük harf olmali!!");

            if (sifre.charAt(sifre.length()-1)>='A' && sifre.charAt(sifre.length()-1)<='Z' ){
                flag++;
            }else System.out.println("Son karakter büyük harf olmali!!");

            if (!sifre.contains(" ")){
                flag++;
            }else System.out.println("Sifre bosluk karakteri icermemeli!!");

            if (sifre.length()>=8){
                flag++;
            }else System.out.println("Sifre en az 8 karakter icermeli!!");
            denemeSayisi++;
        }
        System.out.println("sifreniz kaydedildi!!"+"\nDeneme Sayisi= "+denemeSayisi);


    }
}
