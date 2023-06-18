package day04_ASCII_Wrapper_Classes;

import java.net.SocketImpl;

public class Ornek1 {
    public static void main(String[] args) {

        int a=20;
        int b=6;
        System.out.println(a/b); //3,3333333 ama sadece 3 yazdiriyor

        //Java bolünen iki sayi tamsayi ise sonucun da tamsayi kismini verir.

        double c=6;
        System.out.println(a/c); //3,33333335 veriyor

        //bölünen sayilarin data türleri farkli ise sonucu daha genis olanin cinsinden verir!

        float d=6f;
        System.out.println(a/d); //3,333333 float oldugu icin

        //peki a/b islemini sonucunu ondalikli olarak nasil yazdirabiliriz

        System.out.println((double)a/b);

        //islem önceligi (a/b) dedir
        //Java önce (a/b) islemini yapar ve sonucu int olarak alir sonra double a cevirir(cast eder)
        //o nedenle a/b nin parantezini kaldiriyoruz veya söyle de yazdirabiliriz

        System.out.println(a/(double)b);

        int e =1467;
        System.out.println(e=e/10); //146 int oldugundan
        System.out.println(e); //146
        e=e/10; //14
        System.out.println(e); //14
        e=e/10;
        System.out.println(e); //1
        e=e/10;
        System.out.println(e); //0
    }
}
