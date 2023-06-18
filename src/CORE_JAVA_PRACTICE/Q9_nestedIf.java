package CORE_JAVA_PRACTICE;

import java.util.Scanner;

public class Q9_nestedIf {
    public static void main(String[] args) {

        /*
        2- Kullanicidan aldigi ürün adedi ve liste fiyatini alin, kullaniciya
        müsteri karti olup olmadigini sorun. Müsteri karti varsa ve 10 üründen fazla alirsa
        %20, karti varsa ve 10 üründen az alirsa %15 indirim yapin. Müsteri karti yoksa ve 10
        üründen fazla alirsa %15, müsteri karti yoksa ve 10 üründen az alirsa %10 indirim yapin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen aldiginiz ürün adedini giriniz: ");
        int adet = scan.nextInt();

        System.out.println("Lütfen aldiginiz ürünün liste fiyatini giriniz: ");
        double fiyat = scan.nextDouble();

        System.out.println("Müsteri kartiniz var mi?");
        char kart = scan.next().charAt(0);

        double toplam_fiyat;

        if (kart =='e' || kart == 'E'){
            if (adet>=10){
                toplam_fiyat = ((adet*fiyat))*0.8;
                System.out.println("Ödemeniz gereken tutar= "+toplam_fiyat);
            }
            else System.out.println("Ödemeniz gereken tutar= "+((adet*fiyat))*0.85);

        }
        else if (kart == 'h' || kart == 'H') {
            if (adet>=10){
                toplam_fiyat = ((adet*fiyat))*0.85;
                System.out.println("Ödemeniz gereken tutar= "+toplam_fiyat);
            }
            else System.out.println("Ödemeniz gereken tutar= "+((adet*fiyat))*0.9);
        }
        else System.out.println("Müsteri karti bilgisini yanlis girdiniz!");

    }
}
