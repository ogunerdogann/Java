package day09_10_String_Manipulations;

import java.util.Scanner;

public class Soru_String_Manipulations {
    public static void main(String[] args) {

        // Soru: Kullanicidan bir mail adresi alin
        //mail @ icermiyorsa "gecersiz mail"
        //mail @gmail.com icermiyorsa "mail gmail olmali"
        //mail @gmail.com ile bitmiyorsa "mailde yazim hatasi var" yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen mail adresinizi giriniz: ");
        String mail= scan.next();

        if (!mail.contains("@")){   //bastaki ünleme dikkat! Icermiyorsa sartini böyle saglariz
            System.out.println("gecersiz mail!");

        } else if (!mail.contains("gmail.com")) {
            System.out.println("mail gmail olmali!");

        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        }

        /*
        if-else yapisi ile bagli olduklari icin bir sart saglaniyorsa diger sartlara bakmaz!
        Ancak bu örnekte kullanici üc sarta da uymayan bir mail girisi yapabilir.
        Eger bu üc hatanin ücünü de kullaniciya vermek istiyorsak
        bagimsiz üc tane ayri if yapisi yazmamiz gerekir!!!
         */

    }
}
