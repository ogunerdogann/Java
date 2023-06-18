package Burkay_Alistirma;

import java.util.Scanner;

public class C05_DataCastingSoru5 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        double sayi1= scan.nextDouble();
        System.out.println("Bir sayi daha giriniz: ");
        int sayi2= scan.nextInt();
        double bolum=(int)(sayi1/sayi2);
        System.out.println(bolum);


    }
}
