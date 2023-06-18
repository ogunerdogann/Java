package day28_deneme;

import day28_accessModifier_encapsulation.C03_EncapsuleDatalar;

public class EncapsulationKullanimi {

    public static void main(String[] args) {

        System.out.println(C03_EncapsuleDatalar.getIsim());

        C03_EncapsuleDatalar obj = new C03_EncapsuleDatalar();
        obj.setSatisTutari(100);
        obj.setSatisTutari(200);
        obj.setSatisTutari(300);
        System.out.println("Toplam Satis: "+obj.toplamSatis);
    }
}

/*

   C03_EncapsuleDatalar class'indaki
   isim variable'inin degeri görünsün ama degistirilemesin.
   satisTutari ise deger girilebilsin
   ama girilen degerler sonradan görünemesin.

   Eger bir variable icin read veya write özelliklerinin birbirinden ayrilmasi
   isteniyorsa önce access modifier ile kimsenin
   ulasamamasini saglayin.

   private yaparak kimsenin ulasamayacagini garantiye aldiktan sonra
   read yetkisi vermek istediklerimiz icin getter() methodu,
   write yetkisi vermek icin setter() methodu kullanmaliyiz.

 */
