package CORE_JAVA_PRACTICE;

import java.util.Scanner;

public class Q15_Project_Practice1 {

    static double toplamFiyat = 0;

    public static void main(String[] args) {

        /*
        Kullanicidan alinan bir sayiya kadar Fibonacci Serisi olusturun.
        1 1 2 3 5 8 13 21
         */
     //   Scanner scan = new Scanner(System.in);
     //   System.out.println("Lütfen bir sayi giriniz: ");
     //   int sayi = scan.nextInt();
     //   int toplam=1;
     //   int eleman1 =1;
     //   int eleman2 =0;
     //   System.out.print(toplam); //ilk degeri buraya yazdiriyorum ki degerler arasindaki - sorun yaratmasin!
     //   while (toplam<sayi){
     //       toplam = eleman1+eleman2;
     //       eleman2=eleman1;
     //       eleman1=toplam;
     //       System.out.print("-"+toplam);
     //   }





        /*

        COK GÜZEL BIR ÖRNEK INCELE!!!

        Basit bir 5 ürünlü manav alisveris programi yaziniz.

        1. Adim: ürün listesinden ürün sectir ve kac kilo oldugunu sor.
        2. Adim: Baska bir ürün almak isteyip istemedigini sor.
                 Istemiyorsa toplam miktari göster, istiyorsa tekrar ürün sectir.
                 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
        3. Adim: Müsteri her ürün sectiginde aldigi ürünün fiyatini toplam fiyata ekle.
        4. Adim: Alisveris bitince toplam ödemesi gereken miktari göster. 
         */

        oerdManav();
       
    }
    public static void oerdManav(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen almak istediginiz ürünü seciniz: "+
                "\nElma  icin : 1,  (kg fiyat: 1,36TL)"+
                "\nArmut icin : 2,  (kg fiyat: 2,15TL)"+
                "\nHavuc icin : 3,  (kg fiyat: 1,65TL )"+
                "\nÜzüm  icin : 4,  (kg fiyat: 3,27TL)"+
                "\nIncir icin : 5   (kg fiyat: 4,32TL)"+
                "\n tuslayiniz!");
        int urunSecim = scan.nextInt();
        System.out.println("Sectiginiz üründen kac kg aldiniz?: ");
        double urunKilo = scan.nextDouble();
        if (urunSecim == 1){
            toplamFiyat += (1.36)*urunKilo;
        }
        else if (urunSecim ==2) {
            toplamFiyat += (2.15)*urunKilo;
        }
        else if (urunSecim ==3) {
            toplamFiyat += (1.65)*urunKilo;
        }
        else if (urunSecim ==4) {
            toplamFiyat += (3.27)*urunKilo;
        }
        else if (urunSecim ==5) {
          toplamFiyat += (4.32)*urunKilo;
        }
        else System.out.println("Hatali giris yaptiniz!");
        System.out.println("Baska ürün almak istiyor musunuz?"+
                "\nEvet icin: e"+
                "\nHayir icin h"+
                "\n tuslayiniz!");
        char devamMi = scan.next().toLowerCase().charAt(0);
        if (devamMi == 'h'){
            System.out.println("ÖDENECEK TUTAR: "+toplamFiyat+" TL");
            System.exit(0);   // Program bu satira gelirse direk calismayi durdurur.
        }
        else {
            oerdManav();

        }
    }
}
