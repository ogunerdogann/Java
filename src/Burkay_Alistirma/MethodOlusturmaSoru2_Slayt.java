package Burkay_Alistirma;

import java.util.Scanner;

public class MethodOlusturmaSoru2_Slayt {
    public static void main(String[] args) {

        /*

        Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        isim bosluk soyisim seklinde bize donduren bir method olusturun
        input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Isminizi giriniz: ");
        String isim= scan.nextLine();
        System.out.println("Soyisminizi giriniz: ");
        String soyisim=scan.nextLine();
        System.out.println(IsimMethod(isim, soyisim));

    }
    public static String IsimMethod(String ad, String SoyAd){
        String yeniAd=ad.toUpperCase().charAt(0)+ad.substring(1,ad.length()).toLowerCase();
        String yenisoyAd=SoyAd.toUpperCase().charAt(0)+SoyAd.substring(1,SoyAd.length()).toLowerCase();
        String metin=yeniAd+" "+yenisoyAd;
        return metin;
    }

}
