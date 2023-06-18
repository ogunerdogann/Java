package day07_If_Statements;

import java.util.Scanner;

public class Soru5_if_else_sorulari {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        // olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz: ");
        char carac =scan.next().charAt(0);
        if ('a'<=carac && carac<='z'){
            System.out.println(Character.toUpperCase(carac));

        }
        else System.out.println(carac);

    }
}
