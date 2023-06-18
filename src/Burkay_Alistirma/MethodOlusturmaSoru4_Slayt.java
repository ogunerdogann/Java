package Burkay_Alistirma;

import java.util.Scanner;

public class MethodOlusturmaSoru4_Slayt {
    public static void main(String[] args) {

        /*

        Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
        bolenleri sayisini bulup bize donduren bir method olusturun.

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz: ");
        int sayi= scan.nextInt();
        System.out.println("Girdiginiz sayiyi tam bölen sayilar: ");
        System.out.println(tamBolen(sayi));
    }
    public static int tamBolen(int input){

        int sayac=0;
        for (int i = 1; i <=input ; i++) {
            if (input%i==0){
                sayac++;
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        System.out.print("Tam Bölebilen sayi adedi: ");
        return sayac;
    }
}
