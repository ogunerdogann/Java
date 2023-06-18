package day21_ArrayListis_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru4_Slayt {
    public static void main(String[] args) {

       // Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
       // kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String cümle = scan.nextLine();
        System.out.println("Lütfen bir harf giriniz: ");
        String harf = scan.next();
        int sayac=0;

       String[] kelimeler = cümle.split("");

        for (String each:kelimeler)
        {
        if (each.equalsIgnoreCase(harf)){
            sayac++;
        }
        }
        if (sayac==0){
            System.out.println("Harf Kullanilmamis!!");
        }
        else System.out.println("Harf cümlede "+sayac+" defa kullanilmistir.");


    }
}
