package Burkay_Alistirma;

public class WhileLoop_Soru5Slayt {
    public static void main(String[] args) {
    /*
        Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
        kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
        olusturun.
     */
        UsHesapla(0,3);
    }
    public static void UsHesapla(int sayi, int üssü){
            int sayi2=sayi;
        while (üssü>1){
            sayi *= sayi2;
            üssü--;

        }
        System.out.println(sayi);

    }
}
