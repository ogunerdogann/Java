package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullaniciyaListeOlusturtmak {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
       // liste olarak dondurecek bir method olusturun.
        System.out.println(kullaniciyaListOlusturtma());
    }
    public static List<String> kullaniciyaListOlusturtma(){

        List<String> isimler = new ArrayList<>();
        String girilenIsim="";
        Scanner scan= new Scanner(System.in);

        do {
            System.out.println("Liste'ye eklemek üzere isim giriniz: "
                    +"\nBitirmek icin Q'ya basin");
            girilenIsim=scan.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")){ // böylece kücük veya büyük q oldugunda durum degismeyecek.
                isimler.add(girilenIsim);
            }
        }
        while (!girilenIsim.equalsIgnoreCase("Q"));
        return isimler;
    }
}
