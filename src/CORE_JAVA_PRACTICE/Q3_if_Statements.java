package CORE_JAVA_PRACTICE;

import java.util.Scanner;

public class Q3_if_Statements {
    public static void main(String[] args) {

        /*
        1-Kullanicidan gün ismini alin ve haftaici veya haftasonu
        oldugunu yazdirin.
        ***String icin equals methodunu kullanin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz: ");
        String gun = scan.nextLine();

        if (gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")){

            System.out.println("haftasonu");
        }
        else System.out.println("haftaici");
    }
}
