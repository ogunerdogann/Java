package day12_nested_for_loop;

import java.util.Scanner;

public class C02_Ornek {
    public static void main(String[] args) {

        // dinamik olarak verilen satir ve sütun sayisina göre yildizlardan (*)
        //bir dikdörtgen olusturun
        /*
                  * * * * *
                  * * * * *
                  * * * * *
                  * * * * *
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniz: ");
        int satir= scan.nextInt();
        System.out.println("Lütfen sütun sayisini giriniz: ");
        int sütun= scan.nextInt();


        for (int k=1; k<=satir; k++) {
            for (int i = 1; i <=sütun ; i++) {
                System.out.print(" * ");
            }// sütun sayisi kadar yildiz koyuyoruz. Bu islemi de sütun sayisi kadar yaptirmaliyiz
            System.out.println("");
        }

        System.out.println("=========================");

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sütun ; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }


    }
}
