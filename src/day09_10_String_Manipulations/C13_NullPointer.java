package day09_10_String_Manipulations;

public class C13_NullPointer {
    public static void main(String[] args) {

        // null bir deger degildir, bir pointer'dir, yanina
        //yazildigi non-primitive variable'a deger atanmadigini isaret eder!

        String str;  //Burada str olusturuldu ama deger atanmadi!

        // Java method icerisinde deger atamadan variable olusturulmasina izin verir
        //ama deger atamadan kullanilmasina izin vermez!

        // Bazen programlarda variable'lar olusturulur ama daha sonra deger atanacagi icin
        //deger atamasi yapilmaz! Deger atamasi yapilmadan listeleme bile CTE verdigi icin
        //deger verilmedigini isaretleyecek ama CTE olusmasini engelleyecek bir cözüm olarak
        //null pointer olusturulmustur.

        str=null; // str null degerine sahip degil!! str deger atanmamis diye isaretlendi! böylece kod hata vermeyecek!
        System.out.println(str);  //null yazdirir ama bu bir deger degildir. Aksine deger atanmadigini gösterir!
       // System.out.println(str.concat("Java")); //Cikti: RunTimeError(RTE) null isaretlendigini söylüyor --NullPointerException
       // System.out.println(str.length()); //RTE-- NullPointerException
         System.out.println(str+"Java");   //nullJava yazdirir
        String str2=str+"Java"; // str2=nullJava

       // int sayi=null; hata verir
        //Integer sayi=null; isaretler   Sadece non-primitive'ler icin gecerli!!!


        //Biz genelde String bir ifade olusturup, sonra deger atayacaksak hiclik degeri atariz!!
        String str3=""; //Burada str3'e bir deger atanmistir, atanan bu deger hicliktir!!

     }
}
