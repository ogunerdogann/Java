package day27_StringBuilder;

public class  C03_equals_compare {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        //System.out.println(sb2 == str); CTE
        // Java'da farkli data türüne sahip non-primitive objeler == ile karsilastirilamaz!!

        System.out.println(sb1==sb2); //false new ile olusturuldugu icin! Referans farki!
        System.out.println(sb1==sb1); //true


        System.out.println(sb1.equals(sb2)); // false

        /*
          StringBuilder 'da icerik ayni olsa bile equals methodu false döner
          Cünkü StringBuilder class'inda equals methodu yoktur.
          equals methodunu parent class'i olan Object Class'indan kullanir
          ve bundan dolayi iceriklere bakmadan false verir!
         */

        System.out.println(sb1.equals(str)); //false
        System.out.println(sb1.equals(sb1)); //true ayni objeden geldigi icin

        // iki StringBuilder'in iceriklerinin ayni oldugunu kontrol etmek icin
        // compareTo kullanilir.

        StringBuilder sb3 = new StringBuilder("Hava");
        StringBuilder sb4 = new StringBuilder("Tava");

        System.out.println(sb1.compareTo(sb2)); // 0 fark yok
        System.out.println(sb1.compareTo(sb3)); // 2 J ve H harfleri arasinda 2 harf fark var! J harfi H harfinden 2 harf ileride!
        System.out.println(sb1.compareTo(sb4)); // -10 J harfi farkli olan T harfinden 10 harf geride!
        System.out.println(sb3.compareTo(sb4)); // -12 H harfi T harfinden 12 harf geride!

        /*

           compareTo methodu karsilastirilan StringBuilder'lar ayni metne sahipse 0 döner.
           Ayni degilse bastan itibaren kontrole baslar farkli olan ilk harfin karsilastirilan kelimedeki
           ayni index'indeki harften hac harf ileride veya geride oldugunu döndürür!

         */

    }
}
