package day23_Constructor;

public class Araba {
    int yil;
    String marka="Marka belirtilmemis";
    String model="Model belirtilmemis";
    boolean hasarliMi;
    int fiyat;

    @Override
    public String toString() {
        return "Araba{" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMi=" + hasarliMi +
                ", fiyat=" + fiyat +
                '}';
    }


    public Araba(int yil, String marka, String model, int fiyat) {
        this.yil = yil;
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    public Araba(int yil, String Marka, String Model, boolean hasarliMi, int fiyat){

        /*
          Eger parametre ismi instance variable ismiyle ayni degilse
          bir alttaki constructor'da oldugu gibi direk atama yapabiliriz.
          Ancak genelde projenin daha anlasilir olmasi ve dogru variable'in
          kullanilmasi icin constructor'daki parametre isimleri instance variable'lar ile ayni secilir.
          Bu durumda JAVA'ya ayni isimdeki iki variable'dan hangisinin BU class'daki instance variable oldugunu
          belirtmemiz gerekir. Bunun icin JAVA syntax olarak this. yazilmasini istemistir.

          this. yazmazsak Java en kisa yoldan ulasabilecegi variable'i bulur.
         */

        this.yil =yil;         //this den sonrakilerin class level'daki degiskenler oldugunu belirtmis olduk!
        this.marka=Marka;
        this.model=Model;
        this.hasarliMi=hasarliMi;
        this.fiyat=fiyat;

    }

    public Araba(int fyt, String mrk){
        fiyat=fyt;
        marka=mrk;

    }

    public Araba(){


    }

    public void yakitTuketimi(String yakitTuru){
        switch (yakitTuru){
            case "Benzin" :
                System.out.println("benzinli araclar icin yakit tuketimi: 6 l/100 km");
                break;
            case "dizel" :
                System.out.println("Dizel araclar icin yakit tuketimi: 5 l/100 km");
                break;
            case "Elektrik" :
                System.out.println("Elektrikli araclar icin yakit tuketimi: 5 kW/100 km");
                break;
            default:
                System.out.println("gecersiz yakit turu");
        }
    }

}
