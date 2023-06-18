package day12_nested_for_loop;

import java.util.Scanner;

public class C01_CarpimTablosu_yarim {
    public static void main(String[] args) {

        // Verilen bir rakam icin carpim tablosu olusturun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz: ");
        int rakam= scan.nextInt();

        if (0<=rakam && rakam<=9){
            for (int i = 0; i <9 ; i++) {
                for (int j=1; j <=rakam ; j++) {
                    System.out.println(i+" * "+j+" = "+i*j);
                }
            }

        }

    }
}
