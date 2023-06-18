package day05_Matematiksel_islemler;

public class Increment_Decrement_Deger_artirma_ve_azaltma {
    public static void main(String[] args) {

        //Increment in kalici olmasi icin 3 farkli sekilde atama yapilabilir.
        int sayi=10;
        sayi=sayi+3;

        sayi *= 3; //sayiyi 3 ile carpar. Sayiyi al 3 ile carp ve sayiya ata.

        sayi++; // sayi degerini sadece 1 artirir.

        System.out.println(sayi); //40 verir

        //Ayni yöntemlerle Decrement de yapilabilir.

        int sayi2=10;
        sayi2=sayi2-2;

        sayi2 -= 4; //sayiyi al sayidan 4 cikar ve sayiya ata.

        sayi2--;  //sayiyi 1 azalt

        System.out.println(sayi2);  //3 verir.



    }
}
