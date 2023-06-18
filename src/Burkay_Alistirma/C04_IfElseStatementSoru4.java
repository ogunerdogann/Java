package Burkay_Alistirma;

import java.util.Scanner;

public class C04_IfElseStatementSoru4 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz: ");
        char krk=scan.next().charAt(0);

        if ('A'<=krk && krk<='Z'){
            System.out.println("Karakter Büyük Harf");

        }
        else System.out.println("Karakter büyük degil!");

    }
}
