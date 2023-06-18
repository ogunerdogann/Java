package day09_10_String_Manipulations;

public class C14_replace_Methodu {
    public static void main(String[] args) {

        String str="Java Candir";
        System.out.println(str.replace('J', 'H')); //Hava Candir
        System.out.println(str.replace("a", "")); // Jv Cndir
        System.out.println(str.replace("Java", "X")); // X Candir
        System.out.println(str.replace("v", "yayaya")); //Jayayayaa Candir

        //str daki spaceleri yok edelim
        str=str.replace(" ","");  //atama yaptigimiz icin kalici oldu
        System.out.println(str.replaceFirst("a", "")); //JvaCandir --->ilk gördügü a'yi degistirir

        System.out.println("=================");
        String str2="J1a23va34 5C54and65ir87";
        //str2'deki sayilari methodla temizleyin


        /*
        Eger degistirmek istedigimiz metin tek bir metin degil ortak özelligi olan farkli
        metinlerse;
        -tüm sayilar
        -sayi olmayanlarin tümü
        -tüm space'ler
        -space olmayan tüm karakterler

        bu ortak özellikleri belirtmek icin Java regex tanimlamistir.

        \\s--> space       \\S-->Space olmayan hersey
        \\s+-->yanyana birden fazla space
        \\d-->digits(sayi)  \\D --> digit olmayan hersey
        \\w-->harf veya rakam \\W--> harf veya rakam olmayan hersey    (Slayt S.117)
         */
        System.out.println(str2.replaceAll("\\d", "")); //tüm sayilari hiclikle degistirdi. Cikti:Java Candir

        String str3="J&ava54 C+an01dir,,,";
        //str3'ü Java Candir haline getirin
        str3=str3.replaceAll("\\d",""); //J&ava C+andir,,,
        str3=str3.replaceAll(" ","5");
        str3=str3.replaceAll("\\W","");
        str3=str3.replaceAll("5"," ");

        //replaceAll methodunda char degisimi yapayiz. yani "" ile belirtmeliyiz
        // '' ile degil!! Ancak replace de '' ve "" kullanilabilir, problem yok!

    }
}
