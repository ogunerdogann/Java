package day16_Scope_arrays;

public class C01_Hastane {
    public static void main(String[] args) {

        Adoktor dok1=new Adoktor();
        System.out.println(dok1.askerlikYaptiMi); //false (default deger)
        dok1.isim="Ogün";
        dok1.soyIsim="Erdogan";
        dok1.dogumYili=1995;

        System.out.println(dok1.isim); //Ogün

        Adoktor dok2=new Adoktor();
        System.out.println(dok2.isim); //null
        dok2.soyIsim="Celik";
        System.out.println(dok2.soyIsim);
        System.out.println(dok1);    // referansini yazdirir!
        System.out.println(dok1.fakulte); //Tip
        System.out.println(dok2.fakulte); //Tip

        dok1.isim="Burcu";
        System.out.println(dok2.isim); //null

        dok1.fakulte="Tip Fakultesi";
        System.out.println(dok2.fakulte); //Tip Fakultesi
        //fakulte static bir variable. Static bir variable'in degeri
        //degisirse tüm degiskenler icin degisir. Instance variable'lar icin böyle degildir.

        Adoktor dok3=new Adoktor();
        System.out.println(dok3.dogumYili); //0 (default)
        System.out.println(dok3.fakulte); //Tip fakultesi (static old. dolayi)

        System.out.println(Adoktor.fakulte);
        // static variable'lar icin tavsiye edilen erisim yöntemi
        // classIsmi.staticUyeIsmi seklindedir.
        // Bu yönteme static erisim(access) denir.
    }
}
