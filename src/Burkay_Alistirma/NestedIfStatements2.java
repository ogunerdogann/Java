package Burkay_Alistirma;

import java.util.Scanner;

public class NestedIfStatements2 {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //        %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen aldiginiz ürün adedini giriniz: ");
        int adet= scan.nextInt();
        System.out.println("Lütfen Liste Fiyatini Giriniz: ");
        double fiyat= scan.nextDouble();
        System.out.println("Müsteri Kartiniz var mi?(Evet veya Hayir yaziniz!)");
        String kart= scan.next();


        if (kart.equals("Evet") || kart.equals("evet")){
            if (adet>=10){
                System.out.println("Ödemeniz gereken tutar= "+(adet*fiyat)*0.8);
            } else if (0<adet && adet<10) {
                System.out.println("Ödemeniz gereken tutar= "+(adet*fiyat)*0.85);
            }
            else System.out.println("Hatali parametre girdiniz!!");

        } else if (kart.equals("Hayir") || kart.equals("hayir")) {
            if (adet>=10){
                System.out.println("Ödemeniz gereken tutar= "+(adet*fiyat)*0.85);
            } else if (0<adet && adet<10) {
                System.out.println("Ödemeniz gereken tutar= "+(adet*fiyat)*0.90);
            }
            else System.out.println("Hatali parametre girdiniz!!");
        }


    }
}
