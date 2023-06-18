package Burkay_Alistirma;

import java.util.Scanner;

public class C04_ifElseStatements_Soru4 {
    public static void main(String[] args) {

       // Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        //sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
       // “istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen mesafeyi kilometre olarak giriniz: ");
        double mesafe= scan.nextDouble();
        System.out.println("Cevirmek istediginiz birimi giriniz: ");
        char birim=scan.next().charAt(0);

        if (birim=='c'){
            System.out.println("Mesafe cm cinsinden= "+(mesafe*100000));
        } else if (birim=='m') {
            System.out.println("Mesafe m cinsinden= "+(mesafe*1000));
        }
        else System.out.println("istediginiz birim sisteme kayitli degil");

    }
}
