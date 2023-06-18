package Burkay_Alistirma;

import java.util.Scanner;

public class C05_IfElseStatementSoru5 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
       // olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir harf giriniz: ");
        char krk=scan.next().charAt(0);

        if ('A'<=krk && krk<='Z'){
            System.out.println(krk);

        }
        else System.out.println(Character.toUpperCase(krk));

    }
}
