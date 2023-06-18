package CORE_JAVA_PRACTICE;

import java.util.Scanner;

public class Q10_ternaryOperator {
    public static void main(String[] args) {

        /*
        1- Kullanicidan bir ücgenin üc kenar uzunlugunu alip, ücgen eskenar ise "Eskenar ücgen" yazdirin,
        degilse "Eskenar degil" yazdirin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1. kenar uzunlugunu giriniz: ");
        int kenar1 = scan.nextInt();

        System.out.println("Lütfen 2. kenar uzunlugunu giriniz: ");
        int kenar2 = scan.nextInt();

        System.out.println("Lütfen 3. kenar uzunlugunu giriniz: ");
        int kenar3 = scan.nextInt();

        System.out.println((kenar1 == kenar2 && kenar1 == kenar3 ? "Eskenar ücgen" : "Eskenar degil"));
    }
}
