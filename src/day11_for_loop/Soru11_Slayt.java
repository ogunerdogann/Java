package day11_for_loop;

import java.util.Scanner;

public class Soru11_Slayt {
    public static void main(String[] args) {

        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
        //kontrol edin ve sonucu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz: ");
        int sayi=scan.nextInt();
        int flag=0;


        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
               flag++;
                break;

            }
        }
        if (sayi==2) System.out.println("Girmis oldugunuz sayi Asaldir!!");
        else if (sayi==1) System.out.println("Girmis oldugunuz sayi ASAL DEGILDIR!!!");
        else if (flag!=0){System.out.println("Girdiginiz sayi ASAL DEGILDIR!!!");
        flag=0;}
        else System.out.println("Girmis oldugunuz sayi Asaldir!!");




    }
}
