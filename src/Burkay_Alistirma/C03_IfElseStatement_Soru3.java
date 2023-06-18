package Burkay_Alistirma;

import java.util.Scanner;

public class C03_IfElseStatement_Soru3 {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
       // karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
       //         %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
       // alirsa %15, yoksa %10 indirim yapin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen aldiginiz ürün adedini giriniz: ");
        int adet= scan.nextInt();
        System.out.println("Lütfen birim fiyat giriniz: ");
        double fiyat= scan.nextDouble();
        double toplamTutar=(adet*fiyat);
        System.out.println("Müsteri kartiniz var mi?");
        char mk=scan.next().charAt(0);
        
        if (mk=='e' && adet>=10){
            System.out.println("Toplam tutar= "+(toplamTutar-(toplamTutar*20/100)));
        } else if (mk=='e' && adet<10) {
            System.out.println("Toplam tutar= "+(toplamTutar-(toplamTutar*15/100)));
        } else if (mk=='h' && adet>=10) {
            System.out.println("Toplam tutar= "+(toplamTutar-(toplamTutar*15/100)));
        } else if (mk=='h' && adet<10) {
            System.out.println("Toplam tutar= "+(toplamTutar-(toplamTutar*10/100)));
        }
        else System.out.println("Hatali prametre girdiniz!!");

    }
}
