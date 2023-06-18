package CORE_JAVA_PRACTICE;

import java.util.Scanner;

public class Q7_if_Statements {
    public static void main(String[] args) {

        /*
        INTERVIEW SORUSU!
        Kullanicidan artik yil olup olmadigini kontrol etmek icin
        yil girmesini isteyin
        Kural 1: 4 ile bölünemeyen yillar artik yil degildir
        Kural 2: 4 ile bölünüp 100 ile bölünemeyen yillar artik yildir
        Kural 3: 4'ün kati olmasina ragmen 100 ile bölünebilen yillardan sadece 400'ün kati olanlar artik yildir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Kontrol edilmek üzere bir yil giriniz: ");
        int yil = scan.nextInt();

        if (yil%4 != 0){
            System.out.println("Artik yil degil!");
        } else if (yil%100 != 0) {
            System.out.println("Artik Yildir");
        } else if (yil%400 ==0) {
            System.out.println("Artik Yildir");
        }
        else System.out.println("Artik yil degil!");
    }
}
