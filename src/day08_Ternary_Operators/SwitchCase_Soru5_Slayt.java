package day08_Ternary_Operators;

import java.util.Scanner;

public class SwitchCase_Soru5_Slayt {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ay numarasini giriniz: ");
        int günno = scan.nextInt();

        switch (günno) {


            case 1:
                System.out.println("Hafta Ici");
                break;

            case 2:
                System.out.println("Hafta Ici");
                break;

            case 3:
                System.out.println("Hafta Ici");
                break;

            case 4:
                System.out.println("Hafta Ici");
                break;

            case 5:
                System.out.println("Hafta Ici");
                break;

            case 6:
                System.out.println("Hafta Sonu");
                break;

            case 7:
                System.out.println("Hafta Sonu");
                break;

            default:
                System.out.println("Gecersiz Giris!!");

        }
    }
}
