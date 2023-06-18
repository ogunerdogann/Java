package day08_Ternary_Operators;

import java.util.Scanner;

public class SwitchCase_Soru4_Slayt {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        // ve girilen harfin karsiligini yazdirin.
        //       I : International S : Software T : Testing Q : Qualifications B: Board

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen anlamini ögrenmek istediginiz harfi giriniz: ");
        char harf = scan.next().charAt(0);
        harf=Character.toUpperCase(harf);

        switch (harf) {

            case 'I':
                System.out.println("International");
                break;

            case 'S':
                System.out.println("Software");
                break;

            case 'T':
                System.out.println("Testing");
                break;

            case 'Q':
                System.out.println("Qualifications");
                break;

            case 'B':
                System.out.println("Board");
                break;


            default:
                System.out.println("Hatali Giris!");

        }
    }
}
