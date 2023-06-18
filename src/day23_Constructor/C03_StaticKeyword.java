package day23_Constructor;

public class C03_StaticKeyword {

    static String hastaneIsmi = "Yildiz Hastanesi";
    static  String hastaneTelefonu="1234567890";
    static String basHekimIsmi = "Ogün Erdogan";


    String persIsmi;
     String perAdresi;
   String perTelefonu;

    public static void main(String[] args) {

        C03_StaticKeyword personel1 = new C03_StaticKeyword();
        System.out.println(personel1.persIsmi); //null
        System.out.println(hastaneIsmi); //Yildiz Hastanesi
        System.out.println(personel1.basHekimIsmi); //Ogün Erdogan

        C03_StaticKeyword personel2 = new C03_StaticKeyword();
        personel2.persIsmi="Tarik";
        System.out.println(personel2.persIsmi); //Tarik
        System.out.println(personel1.persIsmi); //null

        personel2.basHekimIsmi="Aytug Erdogan";
        System.out.println(personel1.basHekimIsmi);  //Aytug Erdogan
        /*
           1-static variable'lar tüm class icin gecerlidir. (class variable)
           2-static variable'lar tüm objeler icin ayni degeri tasidiklari icin
             her obje icin ayrica olusturulmaz, sadece bir variable olur.
           3-static variable'lara ulasmak veya update etmek icin obje ismi kullanmaya gerek yoktur,
             direk ulasilabilir.
             Baska class'dan static variable'a ulasmak icin classIsmi.staticVariableIsmi yazilir.
         */
    }
}
