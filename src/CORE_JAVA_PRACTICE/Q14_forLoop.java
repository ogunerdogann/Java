package CORE_JAVA_PRACTICE;

import java.util.Scanner;

public class Q14_forLoop {
    public static void main(String[] args) {

        /*
        1- Kullanicidan pozitif bir tamsayi alin, 1'de girilen sayiya kadar (girilen sayi dahil)
        7 ile bölünebilen sayilari yazdirin.
         */

     //   Scanner scan = new Scanner(System.in);
     //   System.out.println("Lütfen bir sayi giriniz: ");
     //   int sayi = scan.nextInt();
     //   for (int i = 1; i <= sayi ; i++) {
     //       if (i%7 ==0){
     //
     //           System.out.print(i+" ");
     //       }
     //   }

        /*
        2- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar dahil olarak
        aralarindaki tüm sayilarin toplamini yazdirin. Bitis degeri baslangic degerinden kücükse
        'UYARI' yazdirip islemi sonlandirin.
         */

      //  Scanner scan = new Scanner(System.in);
      //  System.out.println("Lütfen baslangic degerini giriniz: ");
      //  int baslangic = scan.nextInt();
      //  System.out.println("Lütfen bitis degerini giriniz: ");
      //  int bitis = scan.nextInt();
      //  int toplam=0;
      //  if (!(baslangic>bitis)) {
      //
      //      for (int i = baslangic; i <= bitis; i++) {
      //          toplam = toplam+i;
      //      }
      //      System.out.println("Toplam= "+toplam);
      //  }
      //  else System.out.println("UYARI!");

       // System.err.println("OERD BABA"); KIRMIZI YAZDIRIR ERROR MESAJI GIBI DÜSÜN!

        /*
         3- Kullanicidan 150'den kücük pozitif bir tamsayi degeri alin, 1'den baslayarak tüm
         tamsayilari yazdirin, sira
         - 3 ile bölünebilen bir sayiya gelirse, sayi yerine WISE
         -5 ile bölünebilen bir sayiya gelirse, sayi yerine QUARTER
         - hem 3 hem 5 ile bölünebilen bir sayiya gelirse, sayi yerine WISE QUARTER
         yazdirin.
         */

      //  Scanner scan = new Scanner(System.in);
      //  System.out.println("Lütfen 150'den kücük bir pozitif tam sayi giriniz: ");
      //  int sayi = scan.nextInt();
      //  if (!(sayi>150) && !(sayi<0)){
      //      for (int i = 1; i <=sayi ; i++) {
      //          if (i%3 ==0 && i%5 ==0){
      //              System.out.print("WISE QUARTER ");
      //          }
      //          else if (i%3 ==0) {
      //              System.out.print("WISE ");
      //          }
      //          else if (i%5 ==0) {
      //              System.out.print("QUARTER ");
      //          }
      //          else System.out.print(i+" ");
      //      }
      //  }
      //  else System.err.println("Lütfen 150'den kücük pozitif tamsayi giriniz!!!");

        /*
        4- Kullanicidan bir String isteyin ve String'i tersine cevirip kaydedin.
         */

      //  Scanner scan = new Scanner(System.in);
      //  System.out.println("Lütfen bir metin giriniz: ");
      //  String metin = scan.nextLine();
      //  String yeniMetin="";
      //  for (int i = metin.length()-1; i >= 0 ; i--) {
      //      yeniMetin += metin.charAt(i);
      //  }
      //  System.out.println(yeniMetin);

        /*
        5- Girilen pozitif bit tamsayinin pozitif tam bölenlerini yazdiralim.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz: ");
        int sayi = scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i == 0){
                System.out.print(i+"-");
            }
        }

    }
}
