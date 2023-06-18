package day13_Method_Olusturma;

public class C02_MethodOlusturma2 {
    public static void main(String[] args) {

        // C01_methodOlusturma.ikiSayiTopla(); Farkli bir classta olmasina ragmen burada da kullanabiliriz.

        /*
        Soru: verdigimiz sayinin faktöriyelini bulan ve
        sonucu bize döndüren bir method olusturun.
         */

        /*
        Method olusturma basamaklari
        1- public static standart (simdilik)
        2- olusturdugumuz method bize bir sonuc döndürecekse döndürecegi
        sonucun data türünü yaz.
        3-method ismi
        4- method parantezi icine methoda göndermemiz gereken bilgileri
        hangi variable ile gönderecegimizi yazalim. (buna methodun parametresi deriz)
        5-döndürülmesi istenen islemi yap
        6- return keyword kullanarak döndürülmesi istenen degeri döndür
         */

        int sonuc=faktoriyelHesapla(5);
        System.out.println(sonuc);

    }
    public static int faktoriyelHesapla(int sayi){

        int faktoriyel=1;
        for (int i=sayi; i>=1; i--){
            faktoriyel *=i;
        }
        return faktoriyel;
    }
}
