package Burkay_Alistirma;

import java.util.Scanner;

public class C03_Soru3 {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz: ");
        int yas= scan.nextInt();

        if (yas>=65) {

            System.out.println("Emekli Olabilirsiniz");
        }
        else System.out.println("Emekli olmaniz gereken yil: " + (65-yas));

    }
}
