package day32_Inheritance_DataTypeKullanimi;

public class HAvciKuslar extends GKuslar {

    public void hareket(){
        System.out.println("ucarlar");
    }
    public void beslenme(){
        System.out.println("et yerler");
    }
    public void pence(){
        System.out.println("pencelidir");
    }
    public void gaga(){
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        HAvciKuslar kartalAvci = new HAvciKuslar();
        kartalAvci.hareket(); // H ucarlar
        kartalAvci.beslenme(); // H et yerler
        kartalAvci.pence(); // H pencelidir
        kartalAvci.gaga(); // H sivri gagali

        kartalAvci.kanat(); // G kanatlidir
        kartalAvci.solunum(); // G akcigerle nefes alirlar
        kartalAvci.cogalma(); // G yumurtayla cogalirlar

        kartalAvci.omur(); // F yasar ve ölürler

        System.out.println("=============");
        GKuslar kuslar = new GKuslar();
        kuslar.hareket(); // F hareket ederler
        kuslar.beslenme(); // F beslenirler
        //kuslar.pence(); // CTE
        kuslar.gaga(); // G gagalari vardir
        kuslar.kanat(); // G kanatlidir
        kuslar.solunum(); // G akcigerle nefes alirlar
        kuslar.cogalma(); // G yumurtayla cogalirlar

        System.out.println("=============");
        GKuslar kartalKus = new HAvciKuslar();
        kartalKus.hareket(); // H ucarlar
        kartalKus.beslenme(); // H et yerler
       // kartalKus.pence(); // CTE
        kartalKus.gaga(); // H sivri gagali

        kartalKus.kanat(); // G kanatlidir
        kartalKus.solunum(); // G akcigerle nefes alirlar
        kartalKus.cogalma(); // G yumurtayla cogalirlar
        kartalKus.omur(); // F yasar ve olurler

        System.out.println("=============");
        FHayvanlar hayvanlar = new FHayvanlar();
        hayvanlar.hareket(); // F hareket ederler
        hayvanlar.beslenme(); // F beslenirler
        //hayvanlar.pence(); // CTE
        //hayvanlar.gaga(); // CTE

        //hayvanlar.kanat(); // CTE
        hayvanlar.solunum(); // F nefes alirlar
        hayvanlar.cogalma(); // F cogalirlar
        hayvanlar.omur(); // F yasar ve olurler


        System.out.println("=============");
        FHayvanlar kartalHayvani = new HAvciKuslar();
        kartalHayvani.hareket(); // H ucarlar
        kartalHayvani.beslenme(); // H et yerler
        // kartalHayvani.pence(); // CTE
        //kartalHayvani.gaga(); // CTE

        //kartalHayvani.kanat(); // CTE
        kartalHayvani.solunum(); // G akcigerle nefes alirlar
        kartalHayvani.cogalma(); // G yumurtayla cogalirlar
        kartalHayvani.omur(); // F yasar ve olurler




        /*

         Özellikler method olarak olusturulmus ise data türü
         ve constructor ayni ise o class'ta aramaya baslarim,
         buldugum ilk degeri kullanirim.

         data türü ve constructor farkli ise

         data türü olan class'dan aramaya baslar
         o class veya parent class'larinda
         bulamazsa CTE verir.

         o class veya parent class'larinda bulursa
         override edilmis mi kontrol eder
         ve en güncel bilgiyi bulup yazdirir

         */
    }
}
