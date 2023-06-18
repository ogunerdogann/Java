package day25_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        System.out.println(sayilar); // [3, 4, 5]

        elementleriArtir(sayilar);
        //elementleri artir methodunu calistirdiktan sonra
        System.out.println("element artir methodundan sonra "+sayilar); //[6 8 10] elementler degisti!

        yeniListeAta(sayilar);
        System.out.println("yeni liste ata methodundan sonra: "+sayilar); //[6 8 10] liste degismedi! [1 2 3] olmadi!

    }

    public static void elementleriArtir(List<Integer> sayilar){
        // tüm elementleri iki katina cikaralim

        for (int i = 0; i < sayilar.size(); i++) {

            sayilar.set(i, 2*sayilar.get(i));
        }

        System.out.println("Elementleri artir methodunda: "+sayilar);
    }

    public static void yeniListeAta(List<Integer> sayilar){
        // sayilar listesine yeni bir List degeri atayip
        // sonra 1,2,3 elementlerini ekleyin

        sayilar = new ArrayList<>();

        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);

        System.out.println("Yeni Liste ata methodunda: "+sayilar);
    }
}
