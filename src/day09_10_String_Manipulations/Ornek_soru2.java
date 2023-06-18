package day09_10_String_Manipulations;

import java.util.Scanner;

public class Ornek_soru2 {
    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
       // duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
       // basariyla kaydedildi" yazdirin
       //         - ilk harf kucuk harf olmali
       // - son karakter rakam olmali
       //         - sifre bosluk icermemeli
      //  - uzunlugu en az 10 karakter olmali

        //soruyu if else ile yaparsak sadece bir hata aliriz,ötekilere bakmaz
        //bagimsiz 4 if cümlesi olmali
        //en sonda4 sarti da sagladigini kontrol eden bir variable (flag) kullanacagiz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Sifrenizi Giriniz: ");
        String sifre= scan.next();
        int flag=0;
        char sonharf=sifre.charAt(sifre.length()-1);

        if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
            flag++;
            }else System.out.println("Ilk karakter kücük olmali!");


        if (sonharf>='0' && sonharf<='9') {
            flag++;
        }else System.out.println("Son karakter rakam olmali!!");


        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli!");
        }else flag++;

        if (sifre.length()>=10){
            flag++;
        }else System.out.println("Sifre en az 10 karakterden olusmalidir!!");

        if (flag==4) System.out.println("Sifre basariyla kaydedildi!!");



    }
}
