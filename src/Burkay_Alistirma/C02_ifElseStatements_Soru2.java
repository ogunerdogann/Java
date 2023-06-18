package Burkay_Alistirma;

import java.util.Scanner;

public class C02_ifElseStatements_Soru2 {
    public static void main(String[] args) {

        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        // obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //zayif yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz: ");
        double kilo= scan.nextDouble();
        System.out.println("Lütfen boyunuzu giriniz: ");
        double boy= scan.nextDouble();
        double index= (kilo*10000 / (boy*boy));

        if (index>30){
            System.out.println("OBEZ!");
        } else if (25<index && index<=30) {
            System.out.println("KILOLU");
        } else if (20<index && index<=25) {
            System.out.println("NORMAL");
        }
        else System.out.println("ZAYIF");

    }
}
