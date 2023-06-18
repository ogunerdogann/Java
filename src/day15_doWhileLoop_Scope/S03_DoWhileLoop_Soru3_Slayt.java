package day15_doWhileLoop_Scope;

import java.util.Scanner;

public class S03_DoWhileLoop_Soru3_Slayt {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
       // bulunuz, tamkare ise true değilse false yazdırınız.
        //        Ornek : input : 16, output: 4

        System.out.println("==============FOR===============");

        Scanner scan= new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi giriniz: ");
        int sayi=scan.nextInt();
        boolean durum=false;
        int tamkare=0;
        int flag=0;

        for (int i =1 ; i < sayi; i++) {

            if ((i*i)==sayi){
                flag++;
                durum=true;
                tamkare=i;
                System.out.println("tamkare "+durum+" "+tamkare);
            }

        }
        if (flag == 0){
            System.out.println("tamkare degil!! "+durum);
        }


        System.out.println("==============WHILE===============");

        int kontrol=0;
        int flag2=0;
        boolean durum2 = false;
        int tamkare2=0;

        while (kontrol<sayi){

            kontrol++;
            if ((kontrol*kontrol)==sayi){
                flag2++;
                tamkare2=kontrol;
                durum2=true;
                System.out.println("Tamkare "+durum2+" "+tamkare2);

            }

        }
        if (flag2 == 0) {
            System.out.println("tamkare degil!! " + durum);
        }

        System.out.println("==============DO-WHILE===============");

        int kontrol2=0;
        int flag3=0;
        boolean durum3 = false;
        int tamkare3=0;

        do {
            kontrol2++;
            if ((kontrol2*kontrol2)==sayi){
                flag3++;
                tamkare3=kontrol2;
                durum3=true;
                System.out.println("Tamkare "+durum3+" "+tamkare3);
            }
        }
        while (kontrol2<sayi);
        if (flag3 == 0) {
            System.out.println("tamkare degil!! " + durum);
        }

    }
}
