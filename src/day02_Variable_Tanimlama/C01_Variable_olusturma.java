package day02_Variable_Tanimlama;

public class C01_Variable_olusturma {

    public static void main(String[] args) {

        int sayi;
        sayi=20;

        System.out.println(sayi);

        //declaration ve assignment ayni satirda olabilir

        int not=80;
        String isim="Ogün";
        boolean ogrenciMi =true;
        double notOrt=89.3;

        //Declaration ve assignment farkli satirlarda olabilir

        int og1=80;

        og1=(og1+99)/5;             //og1 int oldugu icin yuvarlama yaptigina dikkat!

        System.out.println(og1);

        char ilkharf='A'; // Tek karakter seklindeki atamalari char ile yapariz tek tirnak icine yazilir.

        byte degisken1=14;       //buralarda hep farkli türlerde sayilari tanimladik.
        int degisken2=15;        //Bunlardan hicbiri hata vermez ama en mantikli olani byte tir, cünkü hafizafa en az yer tutan odur
        short degisken3=16;      //cünkü hafizafa en az yer tutan odur
        long degisken4=17;

        float sayi1=1/3f;
        System.out.println(sayi1);

        /*
        Float virgülden sonra 6-7 tane basamak yazdirir. Double dan farkli oldugunu belirtmek icin
        sonuna f ya da F yazmamiz gerekir.

         */



        double sayi2=10;
        double sayi3=3;
        System.out.println(sayi2/sayi3);

        /*
        double virgülden sonra 16 basamak alir, ama en kücük sayilara indigi icin son basamaklarda
        kücük hatalar meydana gelebilir. Mesela 15/3=4.9999999999 gibi.
         */

    }

}
