package day08_Ternary_Operators;

import java.util.Scanner;

public class C05_SwitchCaseStatements_GuzelOrnekIncele {
    public static void main(String[] args) {

        /*
        if-else statement kullanacagimiz durumlarda eger olasiliklarin
        sayisi artiyorsa if-else kullanmak cok uzun ve zahmetli olabilir.
        Bu durumlarda switch-case bize yardim eder.
         */

        /*
        Kullanicidan bir harf isteyin. O harf ile bir gün adi
        var ise o günü yazdirin, yok ise gecersiz harf yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz: ");
        char harf=scan.next().charAt(0);
        harf=Character.toUpperCase(harf); //Kullanici kücük harf de girse büyük harfe ceviriyoruz ve sartlarimizi ona göre yaziyoruz. Kücük harfi sorgulatmamiza gerek kalmadi!

        switch (harf){

            case 'P':
                System.out.println("Pazar, Pazartesi veya Persembe");
                break;

            case 'S':
                System.out.println("Sali");
                break;

            case 'C':
                System.out.println("Carsamba, Cuma ve Cumartesi");
                break;

            default: // If-else yapilarindaki else gibi düsün. Hicbir case durumlari gecerli degilse!
                System.out.println("Gecersiz Harf!");

            /*
            Switch case kullanirken eger break yazmazsak Java durdurmadan tüm case durumlarini calistirir.
            Bu örnekte break kullanmasaydik harf girdigimizde tüm ciktilari yazacakti.
            Default icin kullanmaya gerek yok zaten o son durum.

            Ayrica switchcase olaylarinda swiftlerin icindeki paranteze long, double, float, boolean yazilmaz!!
             */




        }
    }
}
