package day28_deneme;

import day28_accessModifier_encapsulation.C03_EncapsuleDatalar;

public class AccessModifierKullanimi {

    public static void main(String[] args) {

        C03_EncapsuleDatalar obj = new C03_EncapsuleDatalar();
        System.out.println(obj.toplamSatis); //read
        obj.toplamSatis=100; //write

        //System.out.println(obj.satisTutari); //read
        //obj.satisTutari=100; //write
        /*

           Baska bir class'daki variable veya methoda ulasmak istedigimizde

           -ulasmak istedigimiz class üyesinin static olup olmamasi
             erisim yöntemini etkiler.
             static ise classIsmi.uyeIsmi yazarken
             static degilse obje olusturup objeIsmi.uyeIsmi

           -ulasmak istedigimiz üyenin access modifier'i ise
             o üyeye ulasip ulasamayacagimizi belirler

             eger ulasabilirsek o datayi okuyabilir ve o dataya deger atayabiliriz-


         */

    }
}
