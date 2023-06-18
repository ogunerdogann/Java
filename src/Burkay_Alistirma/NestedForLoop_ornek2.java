package Burkay_Alistirma;

import java.util.Scanner;

public class NestedForLoop_ornek2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Satir giriniz: ");
        int satir= scan.nextInt();



        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print(j + " ");
                }
            System.out.println("");
            }

        }


}
