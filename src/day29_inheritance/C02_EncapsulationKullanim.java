package day29_inheritance;

public class C02_EncapsulationKullanim {

    public static void main(String[] args) {

      C01 obj = new C01();

      obj.isim="Ogün"; //write
        System.out.println(obj.isim); //read

     obj.setSayi(40); //write
        System.out.println(obj.getSayi()); //read

     /*

        Bir class üyesinin public olmasi ile provate yapilip
        getter ve setter methodlarinin olusturulmasi islevsel acidan
        ayni sonucu olusturur.

        Bazi developer'lar set ve get yetkilerinin kullanildigini
        vurgulamak icin ikinci yöntemi tercih ederler.

      */

    }
}
