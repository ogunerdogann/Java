package day11_for_loop;

import java.util.Scanner;

public class Soru5_Slayt {
    public static void main(String[] args) {

       // Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
       // hesaplayin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 20 den kücük bir tamsayi giriniz: ");
        int sayi= scan.nextInt();
        int carpim=1;

        if (sayi<=20){
            for (int i = 1; i <=sayi ; i++) {
                carpim*=i;
            }
            System.out.println("Faktöriyel= "+carpim);
        }else System.out.println("Gecersiz giris!");

    }
}
