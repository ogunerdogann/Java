package Burkay_Alistirma;

import java.util.Scanner;

public class NestedIfStatements3 {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        //oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
        // yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        double sayi=scan.nextDouble();

        if (sayi%2==0){
            System.out.println("Cift sayi girdiniz!");
          if (sayi%10==0){
              System.out.println("Girdiginiz sayi 10'un tam katidir!");
          }
          else System.out.println("Girdiginiz sayi 10'un tam kati degildir!!");
        } else if (sayi%2 !=0) {
            System.out.println("Tek bir sayi girdiniz!");
            if (sayi<0){
                System.out.println("Girdiginiz Sayi negatiftir!!");
            } else if (sayi>=0) {
                System.out.println("Girdiginiz Sayi pozitiftir!");
            }
        }
    }

    }

