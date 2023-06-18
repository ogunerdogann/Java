package day03_data_casting;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ondalikli sayiyi giriniz: ");
        double ond= scan.nextDouble();
        System.out.println("Lütfen tamsayiyi giriniz: ");
        int tam= scan.nextInt();
        double bolum=(int)(ond/tam);
        System.out.println(bolum);

    }
}
