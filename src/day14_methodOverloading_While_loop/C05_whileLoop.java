package day14_methodOverloading_While_loop;

import java.util.Scanner;

public class C05_whileLoop {
    public static void main(String[] args) {

        /*
          Baslangic ve bitis degeri belli olan veya kac kere tekrar edilecegi bilinen
          loop'larda for loop ideal olarak kullanilabilir. Ancak tekrar sayisi belli olmayan
          baslangic veya bitisi baska bir variable'a bagli olan durumlarda for loop yerine
          while loop tercih edilir.
         */

        // 50 ve 100 arasindaki (sinirlar dahil) sayilari toplayin.

        int toplam=0;
        for (int i = 50; i <=100 ; i++) {
            toplam+=i;
        }
        System.out.println("Toplam= "+toplam); //3825

        //Ayni soruyu while loop ile yapalim
        //for loop'larda üc seyi takip ederiz;
        //1-baslangic degeri
        //2-bitis sarti
        //artis veya azalis sekli

        toplam=0;
        int sayi=50;
        while (sayi<=100){
            toplam+=sayi;
            sayi++;
        }
        System.out.println("While ile toplam= "+toplam); //3825

        //Kullanicidan toplamak üzere sayilar alin
        //toplam 500'ü asinca veya 500 olunca
        //kac sayi girdigini ve sayilarin toplamini yazdirin.



        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        int toplam2=0;
        int girilenSayiAdedi=0;

        while (toplam2<500){ //toplam 500'den kücük oldugu süre boyunca

            System.out.println("Toplanmak üzere bir tamsayi giriniz: ");
            girilenSayi= scan.nextInt();
            toplam2+=girilenSayi;
            girilenSayiAdedi++;
        }
        System.out.println("Toplam 500 sinirina ulasti veya siniri gecti!"+
                "\nGirilen sayi adedi= "+girilenSayiAdedi+
                "\nGirilen sayilarin toplami= "+toplam2);

    }
}
