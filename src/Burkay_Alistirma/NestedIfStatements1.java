package Burkay_Alistirma;

import java.util.Scanner;

public class NestedIfStatements1 {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz: ");
        String cins=scan.next();
        System.out.println("Lütfen yasinizi giriniz: ");
        int yas= scan.nextInt();

        if (cins.equals("Erkek")){
            if (yas>=65){
                System.out.println("Emekli olabilirsiniz!!!");
            } else if (yas<65) {
                System.out.println("Emekli olmak icin "+(65-yas)+" yil daha calismaniz gerekir!");
            }

        } else if (cins.equals("Kadin")) {
            if (yas>=60){
                System.out.println("Emekli olabilirsiniz!!!");
            } else if (yas<60) {
                System.out.println("Emekli olmak icin "+(60-yas)+" yil daha calismaniz gerekir!");
            }
        }
    }
}
