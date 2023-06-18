package day11_for_loop;

import java.util.Scanner;

public class Soru9_Slayt {
    public static void main(String[] args) {

        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String giris= scan.nextLine();
        String cikis="";

        for (int i = giris.length()-1; i >=0 ; i--) {

            cikis += giris.charAt(i);

        }
        System.out.println(cikis);

    }
}
