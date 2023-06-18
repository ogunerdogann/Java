package day11_for_loop;

import java.util.Scanner;

public class Soru10_Slayt {
    public static void main(String[] args) {

        //Soru 10 (interview)- Kullanicidan bir String isteyin ve Stringi tersine cevirip
       // kaydedin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String cümle= scan.nextLine();
        String cikis="";
        for (int i =cümle.length()-1; i >=0 ; i--) {
            cikis+=cümle.charAt(i);
        }cümle=cikis;
        System.out.println(cümle);

    }
}
