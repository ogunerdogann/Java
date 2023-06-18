package day11_for_loop;

import java.util.Scanner;

public class Soru6_Slayt {
    public static void main(String[] args) {

       // Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
       // hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
      //  Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 20 den kücük bir tamsayi giriniz: ");
        int sayi= scan.nextInt();
        int carpim=1;

        if (sayi<=20){
            System.out.print(sayi+"!= "+sayi);
            for (int i = sayi; i >=1 ; i--) {
                carpim*=i;
                if (i==sayi) {
                    System.out.print("");
                }else System.out.print(" * " + i);


            }System.out.print("= "+carpim);

        }else System.out.println("Gecersiz giris!");

    }
}
