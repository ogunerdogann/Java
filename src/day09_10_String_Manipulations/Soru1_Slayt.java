package day09_10_String_Manipulations;

import java.util.Scanner;

public class Soru1_Slayt {
    public static void main(String[] args) {

       // Soru 1 : Kullanicidan bir cumle alin
       // - cumlede ev geciyorsa, "home home sweet home" yazdirin
      //          - cumlede is geciyorsa, "calismak guzeldir"
      //          - ikisini de iceriyorsa "Hem ev lazim hem is"
      //          - hicbirini icermiyorsa "cok calisman lazim" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String cümle = scan.nextLine();

        if (cümle.contains("ev")){
            if (cümle.contains("is")) {
                System.out.println("hem ev lazim hem is");
            }else System.out.println("home home sweet home");
        }
        else if (cümle.contains("is")){
            System.out.println("calismak güzeldir");
        }else System.out.println("Cok calisman lazim");




    }
}
