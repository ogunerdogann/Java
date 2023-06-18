package day22_Constructors;

public class C07_ArabaRunner {

    public static void main(String[] args) {

        C06_Araba araba1=new C06_Araba();
        araba1.marka="Toyota";
        araba1.hasarliMi=false;
        araba1.model="Corolla";
        araba1.yil=2017;
        araba1.fiyat=5250;

        System.out.println("Marka: "+araba1.marka+" model: "+araba1.model);
        System.out.println(araba1);  //Bir önceki class'ta  toString methodu olusturuldu!

        C06_Araba araba2 = new C06_Araba("Honda","Jazz",true,2010,3000);
        System.out.println(araba2);

        C06_Araba araba3 = new C06_Araba("BMW","X6",false,2022,100000);
        System.out.println(araba3);
    }

}
