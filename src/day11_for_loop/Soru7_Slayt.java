package day11_for_loop;

import java.util.Scanner;

public class Soru7_Slayt {
    public static void main(String[] args) {

        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz: ");
        int toplam=0;


            for (int sayi= scan.nextInt(); sayi>0 ; sayi=sayi/10) {

                toplam+=sayi%10;


            }System.out.println("Rakamlar toplami= "+toplam);


            //---------------IKINCI YOL-----------------


        int birler=0;
        int toplam2=0;
        System.out.println("Birkez daha giriniz: ");
        int sayi2= scan.nextInt();
        int basamaksayisi= (sayi2+"").length();

        for (int i = 1; i <=basamaksayisi ; i++) {
            birler=sayi2%10;
            toplam2+=birler;
            sayi2/=10;
        }
        System.out.println("toplam= "+toplam2);





    }
}
