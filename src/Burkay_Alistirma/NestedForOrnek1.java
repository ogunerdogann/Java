package Burkay_Alistirma;

import java.util.Scanner;

public class NestedForOrnek1 {
    public static void main(String[] args) {
        // Kullanicidan satir ve sütun sayilarini alin.
        // girilen satir ve sütun sayisina göre carpim tablosu olusturun.

        Scanner scan=new Scanner(System.in);
        System.out.println("Satir sayisi giriniz: ");
        int satir= scan.nextInt();
        System.out.println("Sütun sayisi giriniz: ");
        int sütun =scan.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j<=sütun ; j++) {
                System.out.print(" "+(i*j));

            }
          //  System.out.print("----->"+i+" * "+j);
            System.out.println("");
        }

    }
}
