package CORE_JAVA_PRACTICE;

import java.util.Scanner;

public class Q11_ternaryOperator {
    public static void main(String[] args) {

      //  /*
      //  2- Kullanicidan bir harf isteyin, girilen karakterler kücük harf ise onu büyük harf olarak
      //  yazdirin. Girilen karakterler büyük harf ise girilen harfi yazdirin.
      //   */
//
      //  Scanner scan = new Scanner(System.in);
      //  System.out.println("Lütfen bir harf giriniz: ");
      //  char harf = scan.next().charAt(0);
      //  //System.out.println((harf>='a' && harf<='z' ? (char)(harf-32) : harf));
      //  System.out.println((harf>='a' && harf<='z' ? Character.toUpperCase(harf) : harf));

        // NOT: MULTU CURSOR KISAYOLU: Alt+J


        /*
        3- Kullanicidan iki adet sayi isteyin ve büyük olmayan sayiyi yazdirin
         */

       // Scanner scan= new Scanner(System.in);
       // System.out.println("Lütfen birinci sayiyi giriniz: ");
       // int sayi1 = scan.nextInt();
//
       // System.out.println("Lütfen ikinci sayiyi giriniz: ");
       // int sayi2 = scan.nextInt();
//
       // System.out.println((sayi1 <= sayi2 ? sayi1 : sayi2));


        /*
        4- Kullanicidan notunu alin 50 veya daha büyükse "Sinifi gectin",
        degilse "Malesef kaldin" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz: ");
        double not = scan.nextDouble();
        System.out.println((not >= 50 ? "Sinifi gectiniz" : "Malesef kaldiniz"));

    }
}
