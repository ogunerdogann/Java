package CORE_JAVA_PRACTICE;

import java.util.Scanner;

public class Q12_Switch_statements {
    public static void main(String[] args) {

        /*
        1- Kullanicidan bir rakam alip rakami yaziyla yazdirin.
         */

        //Scanner scan = new Scanner(System.in);
        //System.out.println("Lütfen bir rakam giriniz: ");
        //int rakam = scan.nextInt();
//
        //switch (rakam){
//
        //    case 0 : System.out.println("Sifir");
        //        break;
        //    case 1 : System.out.println("Bir");
        //        break;
        //    case 2 : System.out.println("Iki");
        //        break;
        //    case 3 : System.out.println("Üc");
        //        break;
        //    case 4 : System.out.println("Dört");
        //        break;
        //    case 5 : System.out.println("Bes");
        //        break;
        //    case 6 : System.out.println("Alti");
        //        break;
        //    case 7 : System.out.println("Yedi");
        //        break;
        //    case 8 : System.out.println("Sekiz");
        //        break;
        //    case 9 : System.out.println("Dokuz");
        //        break;
        //    default: System.out.println("Hatali giris yaptiniz");
        //}


        /*
        2- Kullanicidan ay numarasini alip ay ismini yazdirin.
         */

        //Scanner scan = new Scanner(System.in);
        //System.out.println("Lütfen bir ay numarasi giriniz: ");
        //int ay = scan.nextInt();
        //switch (ay){
        //  case 1 :
        //      System.out.println("Ocak");
        //      break;
        //  case 2 :
        //      System.out.println("Subat");
        //      break;
        //    case 3 :
        //        System.out.println("Mart");
        //        break;
        //    case 4 :
        //        System.out.println("Nisan");
        //        break;
        //    case 5 :
        //        System.out.println("Mayis");
        //        break;
        //    case 6 :
        //        System.out.println("Haziran");
        //        break;
        //    case 7 :
        //        System.out.println("Temmuz");
        //        break;
        //    case 8 :
        //        System.out.println("Agustos");
        //        break;
        //    case 9 :
        //        System.out.println("Eylül");
        //        break;
        //    case 10 :
        //        System.out.println("Ekim");
        //        break;
        //    case 11 :
        //        System.out.println("Kasim");
        //        break;
        //    case 12 :
        //        System.out.println("Aralik");
        //        break;
        //    default: System.out.println("Hatali giris yaptiniz");
        //}


        /*
        3- Kullanicidan ay numarasini alip mevsimi yazdirin.
         */

         // Scanner scan = new Scanner(System.in);
         // System.out.println("Lütfen bir ay numarasi giriniz: ");
         // int ay = scan.nextInt();
//
         // switch (ay){
         //     case 9,10,11 :
         //         System.out.println("SONBAHAR");
         //         break;
         //     case 12,1,2 :
         //         System.out.println("KIS");
         //         break;
         //     case 3,4,5 :
         //         System.out.println("ILKBAHAR");
         //         break;
         //     case 6,7,8 :
         //         System.out.println("YAZ");
         //         break;
         //     default:
         //         System.out.println("Hatali giris yaptiniz");
         // }

        /*
        4- Kullanicidan yili ve ay numarasini alip o yildaki o ayda kac gün oldugunu yazdirin
         */

           Scanner scan = new Scanner(System.in);
           System.out.println("Lütfen yili giriniz: ");
           int yil = scan.nextInt();
           System.out.println("Lütfen gün sayisini ögrenmek istediginiz ay numarasini giriniz: ");
           int ayNo = scan.nextInt();

           switch (ayNo){
               case 1,3,5,7,8,10,12 :
                   System.out.println("Girmis oldugunuz ay 31 gün cekmektedir!");
                   break;
               case 4,6,9,11 :
                   System.out.println("Girmis oldugunuz ay 30 gün cekmektedir!");
                   break;
               case 2 :
                   System.out.println((yil % 4 == 0 && (yil % 100 != 0) || yil % 400 == 0 ?
                           "Girmis oldugunuz ay 29 gün cekmektedir(artikyil)" :
                           "Girmis oldugunuz ay 28 gün cekmektedir"));
                   break;
               default: System.out.println("Hatali giris yaptiniz!");
           }

    }
}
