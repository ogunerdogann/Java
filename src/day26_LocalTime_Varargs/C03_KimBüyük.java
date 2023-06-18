package day26_LocalTime_Varargs;

import java.time.LocalDate;
import java.util.Scanner;

public class C03_KimBüyük {
    public static void main(String[] args) {

        /*

           Kullanicidan iki farkli kisinin isim ve dogum tarihinin gün
           ay ve yilini alip, hangi tarihte dogan kisinin daha büyük
           oldugunu yazdirin.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ilk kisinin ismini giriniz!");
        String isim1 = scan.nextLine();

        System.out.println("Ikinci kisinin ismini giriniz!");
        String isim2 = scan.nextLine();

        System.out.println("ilk kisinin dogum tarihini gün, ay ve yil olarak girin");
        int gün= scan.nextInt();
        int ay= scan.nextInt();
        int yil= scan.nextInt();

        LocalDate tarih1 = LocalDate.of(yil,ay,gün);

        System.out.println("ikinci kisinin dogum tarihini gün, ay ve yil olarak girin");
        gün= scan.nextInt();
        ay= scan.nextInt();
        yil= scan.nextInt();

        LocalDate tarih2 = LocalDate.of(yil,ay,gün);

        System.out.println(tarih2.isAfter(tarih1) ?
                "Büyük olan: "+isim1 :
                "Büyük olan: "+isim2
                );
    }
}
