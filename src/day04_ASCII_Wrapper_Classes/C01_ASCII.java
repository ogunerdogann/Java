package day04_ASCII_Wrapper_Classes;

public class C01_ASCII {
    public static void main(String[] args) {

        /*
        char data türündeki degerler ve variable ler
        sayisal data türlerine atanirsa veya
        sayisal data türündeki datalarla isleme sokulursa
        ASCII tablosundaki degerleri ile isleme girer
         */

        System.out.println(5+'a');  //5+97(a'nin ASCII degeri) =102
        char ilkHarf=101;
        System.out.println(ilkHarf); //e(ASCII degeri)
        char girilenChar='f';
        System.out.println(girilenChar+1); //102+1=103
        //biz 103'ü degil, 103'ün karsiligi olan char ifadeyi yazdirmak istersek explicit casting yapariz
        System.out.println("Girilen harfin bir sonrasi: "+(char)(girilenChar+1));

    }
}
