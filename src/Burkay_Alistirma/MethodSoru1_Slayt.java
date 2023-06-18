package Burkay_Alistirma;

import java.util.Scanner;

public class MethodSoru1_Slayt {

    public static void main(String[] args) {

        /*

    Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
   baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
   bir method olusturun.
   - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
   mesaji verin
  - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
   yazdirin.

     */
        StringMethod();
       // String og="123456789";
      //  System.out.println(og.substring(0, 5)); //substring son index'i zaten almiyor!! Extra -1 yazmana gerek yok!!

    }

    public static void StringMethod(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cümle giriniz: ");
        String cümle= scan.nextLine();
        System.out.println("Baslangic index'ini giriniz: ");
        int basIndx= scan.nextInt();
        System.out.println("Bitis index'ini giriniz: ");
        int bitIndx= scan.nextInt();
        if (bitIndx<=basIndx){
            System.out.println("Baslangic index'i bitis index'inden kücük olmalidir!!!");
        }
        else if (bitIndx>cümle.length()){
            System.out.println("Bitis index'i cümle uzunlugundan büyük olamaz!!!");
        }else {
            System.out.println("Iki index arasindaki harfler: ");
            System.out.println(cümle.substring(basIndx, bitIndx));
        }
    }
}
