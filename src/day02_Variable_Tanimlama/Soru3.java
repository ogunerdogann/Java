package day02_Variable_Tanimlama;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

       // Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
       // Isminiz : John
        // Soyisminiz : Doe
       // Yasiniz : 44
       // Kaydiniz basariyla tamamlanmistir.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adinizi giriniz: ");
        String ad=scan.nextLine();   // Eger iki tane adi varsa ikisini de alacagiz
        System.out.println("Lütfen Soyadinizi giriniz: ");
        String SoyAd= scan.next();
        System.out.println("Lütfen yasinizi giriniz: ");
        int yas= scan.nextInt();
        System.out.println("Lütfen dogdugunuz sehri giriniz: ");
        String memleket= scan.next();
        /*
        System.out.println("Isminiz: "+ad);
        System.out.println("Soyisminiz: "+SoyAd);
        System.out.println("Yasiniz: "+yas);
        System.out.println("Memleketiniz: "+memleket);
        System.out.println("Kaydiniz basariyla alinmisitir."); //Eger sondaki "-ln" ifadesini silersen hepsini yanyana yazdirir.!! ln zaten Line nin kisaltilmisi!
*/
        /*
        Yalniz bu yazdirma sekli güzel olmadi. "\n" kullanarak da alt satira gecebiliriz.
        Alt satira gecmek istedigin string ifadenin hemen basinda tirnak icinde kullanmak gerekecek.
        Ve evet \n sadece String ifadelerde kullanilir
         */

        System.out.println("Isminiz: "+ad+

                "\nSoyisminiz: "+SoyAd+
                "\nYasiniz: "+yas+
                "\nMemleketiniz: "+memleket+
                "\nKaydiniz basariyla alinmisitir."

    );

     /*
     Kullanici istedigimiz türde veri girmezse kodda hata olusur ve calismaz
     Ileride kullanici hatalariyla nasil bas edecegimizi görecegiz.
      */

    }
}
