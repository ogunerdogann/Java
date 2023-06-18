package day03_data_casting;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

       // Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz: ");
        char harf= scan.next().charAt(0);
        char harf1=(char)(harf+1);  // bastaki (char) i koymazsan a nin ascii degerini 1 artirir yani 98 degeri yazar.
        char harf2=(char)(harf1+1);
        char harf3=(char)(harf2+1);
        System.out.println(harf1+"\n"+harf2+"\n"+harf3);



    }
}
