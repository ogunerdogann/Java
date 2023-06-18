package day09_10_String_Manipulations;

import java.util.Scanner;

public class Soru6_Slayt {
    public static void main(String[] args) {

       // Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
       // :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
       //         yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String cümle= scan.nextLine();
        int cümleu=cümle.length();
        if (cümleu%2==0){
            System.out.println(cümle.substring(0,cümleu/2).concat(":)")+cümle.substring(cümleu/2));
        }else {
            cümleu=(cümleu+1)/2;
            System.out.println(cümle.substring(0,cümleu-1).concat(":(")+cümle.substring(cümleu));
        }



    }
}
