package day20_ArrayList;

public class C08_BaskaClasstanKullanma {
    public static void main(String[] args) {

        // verilen sayinin pozitif tam bolenleri sayisi 10'dan cok ise
        // "Güzel" yoksa "Kötü" yazdirin.

        int sayi =100;

        int pozitifTamBolenlerSayisi = C07_TamBolenler.pozitifBolenleriListele(sayi).size();

        if (pozitifTamBolenlerSayisi>10) System.out.println("Güzel");
        else System.out.println("Kötü");

    }
}
