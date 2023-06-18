package Burkay_Alistirma;

import java.util.Scanner;

public class MethodOlusturmaSoru3_Slayt {
    public static void main(String[] args) {

        /*

        Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
       olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
       sonuclarini donduren bir method olusturun.

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tamsayi degeri giriniz: ");
        int sayi=scan.nextInt();
        AsalSayi(sayi);


    }

    public static int AsalSayi(int asalMi){

        int flag=0;
        for (int i = 2; i <asalMi ; i++) {
            if (asalMi%i==0){

                flag++;
                break;
            }

        }if (asalMi==2) {
            System.out.println("Asaldir");
        } else if (asalMi==1) {
            System.out.println("Asal Degil!");
        } else if (flag!=0) {
            System.out.println("Asal Degildir!");
            flag=0;
        }
        else System.out.println("Asaldir");

        return asalMi;
    }

}
