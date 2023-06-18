package CORE_JAVA_PRACTICE;

import java.util.Locale;
import java.util.Scanner;

public class Q6_if_Statements {
    public static void main(String[] args) {

        /*
        Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        sorun, istedigi birim metre veya santimetre ise cevirip yazdirin,
        yoksa "istediginiz birim kayitli degil" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Kilometre cinsinden bir mesafe giriniz: ");
        double mesafe = scan.nextDouble();

        System.out.println("Lütfen cevirmek istediginiz birimi giriniz: ");
        String birim = scan.next();

        if (birim.equalsIgnoreCase("santimetre")){
            System.out.println("Mesafe cm cinsinden = "+(mesafe*100000));
        } else if (birim.equalsIgnoreCase("metre")) {
            System.out.println("Mesafe m cinsinden: "+(mesafe*1000));
        }
        else System.out.println("Istediginiz birim sisteme kayitli degil");
    }
}
