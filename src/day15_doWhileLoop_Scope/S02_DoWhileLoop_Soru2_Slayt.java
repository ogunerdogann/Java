package day15_doWhileLoop_Scope;

import java.util.Scanner;

public class S02_DoWhileLoop_Soru2_Slayt {
    public static void main(String[] args) {

        /*
        Soru 2- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
        kontrol edin ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
                - Sifre kucuk harf icermelidir
                - Sifre buyuk harf icermelidir
                - Sifre ozel karakter icermelidir
                - Sifre en az 8 karakter olmalidir.
        */

        System.out.println("===============FOR===============");

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen sifrenizi giriniz: ");
        String sifre= scan.nextLine();
        boolean sart1=false;
        boolean sart2=false;
        boolean sart3=false;
        boolean sart4=false;
        int flag=0;


        for (int i = 0 ; i < sifre.length()-1 ; i++) {
            if (sifre.charAt(i)>='a' && sifre.charAt(i) <='z'){
                sart1=true;
            }
            else if (sifre.charAt(i)>='A' && sifre.charAt(i)<='Z'){
                sart2=true;
            }
            else if (sifre.charAt(i)>=' ' && sifre.charAt(i)<='?'){
                sart3=true;
            }
            else if (sifre.length()>=8){
                sart4=true;
            }

        }

        if (sart1==true){
            flag++;
        }
        else System.out.println("sifre kücük harf icermelidir!");

        if (sart2==true){
            flag++;
        }
        else System.out.println("sifre büyük harf icermelidir!");

        if (sart3==true){
            flag++;
        }
        else System.out.println("sifre özel karakter icermelidir!");

        if (sart4==true){
            flag++;
        }
        else System.out.println("sifre en az 8 karakterden olusmalidir!!");

        if (flag==4) System.out.println("Sifreniz basariyla kaydedilmistir!!");

        System.out.println("===============WHILE===============");

        boolean sartWhile1=false;
        boolean sartWhile2=false;
        boolean sartWhile3=false;
        boolean sartWhile4=false;
        int baslangic=0;
        int bitis=sifre.length()-1;
        int flag2=0;
        int index=0;

        while (flag2!=4){

            index++;

            if (sifre.charAt(index)>='a' && sifre.charAt(index)<='z'){
                sartWhile1=true;

                flag2++;
            } else System.out.println("Sifre kücük harf icermelidir!");
            if (sifre.charAt(index)>='A' && sifre.charAt(index)<='Z') {
                sartWhile2=true;

                flag2++;
            }else System.out.println("Sifre büyük harf icermelidir!");
            if (sifre.charAt(index)>=' ' && sifre.charAt(index)<='?'){
                sartWhile3=true;

                flag2++;
            }else System.out.println("Sifre özel karakter icermelidir!");
            if (sifre.length()>=8){
                sartWhile4=true;

                flag2++;
            }else System.out.println("Sifre en az 8 karakterden olusmalidir!");



            if (flag2==4){
                System.out.println("Sifre kaydedildi!");
            }
            break;
        }
    }
}
