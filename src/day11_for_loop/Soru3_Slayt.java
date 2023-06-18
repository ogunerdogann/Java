package day11_for_loop;

import java.util.Scanner;

public class Soru3_Slayt {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen baslangic degerini giriniz: ");
        int bas= scan.nextInt();
        System.out.println("Lütfen bitis degerini giriniz: ");
        int son=scan.nextInt();
        int toplam=0;

       if (bas<=son){
           for (int i = bas; i <=son ; i++) {
               toplam += i;

           }System.out.println("Toplam= "+toplam);
       }else System.out.println("UYARI!");

    }
}
