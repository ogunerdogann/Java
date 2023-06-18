package Burkay_Alistirma;

public class NestedForOrnek2 {
    public static void main(String[] args) {

       /*
        Su sekli yazdirin

         * * * * * * * *
         * * * * * * *
         * * * * *
         * * *
         * *
         *

        */

        int sütun=6;

        for (int i = 1; i <=sütun ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }

        System.out.println("===================");

        for (int i = sütun; i >=1 ; i=i-2) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
