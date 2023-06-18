package Burkay_Alistirma;

import java.util.Scanner;

public class WhileLoop_Soru4Slayt {
    public static void main(String[] args) {

        /*

        Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyinKullaniciya bitirmek
        istediginde 0'a basmasini soyleyin
        Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
        bunlarin toplaminin kac oldugunu yazdirin
        Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
        negatif sayiyi sayi adedine ve toplama eklemeyin

         */

        Scanner scan=new Scanner(System.in);


        int sayi=1;
        int toplam=0;
        int sayiAdedi=0;


        while (sayi!=0){
            System.out.println("Toplamak üzere pozitif tamsayilar giriniz, islemi bitirmek icin 0'a basiniz: ");
            sayi= scan.nextInt();

            if(sayi!=0) {

                toplam += sayi;
                sayiAdedi++;
            }
            if (sayi<0){
                System.out.println("Negatif sayi giremezsiniz!!");
                sayiAdedi--;
            }

        }
        System.out.println(toplam+"\n"+sayiAdedi);


    }
}
