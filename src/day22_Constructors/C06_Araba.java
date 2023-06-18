package day22_Constructors;

public class C06_Araba {

    /*
       Bir obje olusturulurken
       default constructor veya parametresiz görünür constructor kullanilirsa
       obje ilk atanan degerlere sahip olur.
       Istedigimiz degerleri atamak icin tek tek tüm variable'lara
       atama yapmamiz gerekir.

       Bunun yerine

       atamak istedigimiz degerleri parametre olarak
       constructor'a yollayalim
       ve atamalari constructor icinde yapalim.
     */


    @Override
    public String toString() {
        return "Araba Özellikleri {" +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMi=" + hasarliMi +
                " yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }

    public C06_Araba(String mrk, String mdl, boolean hMi, int yl, int fyt){
      yil=yl;
      marka=mrk;
      model=mdl;
      hasarliMi=hMi;
      fiyat=fyt;

    }

    public C06_Araba(){


    }

    int yil;
    String marka="";
    String model="";
    boolean hasarliMi;
    int fiyat;

    public void yakitTüketimi(String yakitTürü){

        switch (yakitTürü){
            case "Benzin":
                System.out.println("Benzinli araclar icin yakit tüketimi: 6l/100km");
            break;

            case "Dizel":
                System.out.println("Dizel araclar icin yakit tüketimi: 5l/100km");
                break;
            case "elektrik":
                System.out.println("Elektrikli araclar icin yakit tüketimi: 5kW/100km");
                break;
            default:
                System.out.println("gecersiz yakit türü");


        }
        System.out.println();
    }
}
