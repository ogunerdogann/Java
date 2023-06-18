package day08_Ternary_Operators;

import java.util.Scanner;

public class SwitchCase_Soru2_Slayt {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki basamakli bir sayi giriniz: ");
        int sayi= scan.nextInt();
        int onlar =sayi/10;
        int birler=sayi%10;



        switch (onlar){
            case 1:
                System.out.print("On");
                break;
            case 2:
                System.out.print("Yirmi");
                break;
            case 3:
                System.out.print("Otuz");
                break;
            case 4:
                System.out.print("Kirk");
                break;
            case 5:
                System.out.print("Elli");
                break;
            case 6:
                System.out.print("Altmis");
                break;
            case 7:
                System.out.print("Yetmis");
                break;
            case 8:
                System.out.print("Seksen");
                break;
            case 9:
                System.out.print("Doksan");
                break;

            default:
                System.out.println("Hatali Giris!");

        }
        switch (birler){
            case 0:
                System.out.println("");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üc");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("alti");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;


            default:
                System.out.println("Hatali giris!");


        }

        System.out.print(onlar+""+birler);


    }
}
