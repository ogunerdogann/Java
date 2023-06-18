package day32_Inheritance_DataTypeKullanimi;

public class CYirticiKuslar extends BKuslar {

    String hareket = "ucarlar";
    String beslenme = "et yerler";
    String pence = "pencelidirler";
    String gaga = "sivri gagali";

    public static void main(String[] args) {

        CYirticiKuslar kartalAvci = new CYirticiKuslar();
        System.out.println(kartalAvci.hareket);//C -> ucarlar
        System.out.println(kartalAvci.beslenme);//C -> et yerler
        System.out.println(kartalAvci.pence);//C -> pencelidirler
        System.out.println(kartalAvci.gaga);//C -> sivri gagali

        System.out.println(kartalAvci.kanat);// B -> kanatlidirlar
        System.out.println(kartalAvci.solunum);// B -> akcigerle nefes alirlar
        System.out.println(kartalAvci.cogalma);// B -> yumurtayla cogalirlar

        System.out.println(kartalAvci.omur);// A ->Yaşar ve ölürler


        BKuslar kartalKus = new CYirticiKuslar();
        System.out.println(kartalKus.hareket);//A hareket ederler
        System.out.println(kartalKus.beslenme);// A beslenirler
        //System.out.println(kartalKus.pence);// CTE
        System.out.println(kartalKus.gaga);//B gagalari vardir

        System.out.println(kartalKus.kanat);// B -> kanatlidirlar
        System.out.println(kartalKus.solunum);// B -> akcigerle nefes alirlar
        System.out.println(kartalKus.cogalma);// B -> yumurtayla cogalirlar

        System.out.println(kartalKus.omur); // Yasar ve ölürler

        AHayvanlar kartalHayvan = new CYirticiKuslar();

        System.out.println(kartalHayvan.hareket);//A hareket ederler
        System.out.println(kartalHayvan.beslenme);// A beslenirler
        //System.out.println(kartalKus.pence);// CTE
        //System.out.println(kartalHayvan.gaga);//CTE

        //System.out.println(kartalHayvan.kanat);// CTE
        System.out.println(kartalHayvan.solunum);// A nefes alirlar
        System.out.println(kartalHayvan.cogalma);// A -> cogalirlar

        System.out.println(kartalHayvan.omur); // Yasar ve ölürler


    }

    // Variable olarak özellikleri olusturursak
    //BKuslar kuslar = new BKuslar();
    //BKuslar avciKuslar = new CYirticiKuslar();
    // bu iki obje arasinda fark göremeyiz.

    /*

       Eger bir obje olusturulurken Data türü
       ve constructor ayni ise
       aradigimiz özellikler icin direk o class'a gider ve özellikleri
       arariz.

       Eger Data türü ve constructor farkli ise
       variable ve methodlar farkli davranirlar.

       Variable'lar
       -önce Data türünün oldugu class'a bakar
       o variable'i bulursa degerini yazdirir,
       bulamazsa Data türünün parent'larina bakar.
       Orada bulursa degerini yazdirir, bulamazsa
       CTE verir.

       Özetle bir özelligi variable olarak olusturursaniz
       data türü olan class ve parent'larindaki ortak
       özelliklere bakar, en güncel bilgiyi aramaz!

     */

}
