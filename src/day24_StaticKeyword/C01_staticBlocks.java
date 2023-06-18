package day24_StaticKeyword;

public class C01_staticBlocks {
    public static void main(String[] args) {
        System.out.println("main method calisti");

        System.out.println("=========");
        C01_staticBlocks obj1 = new C01_staticBlocks(); //obje olusturmadan önceki calisan static olmayan blocku calistirmak icin
    }

    static{

        /*
          static block lar class ilk calismaya basladiginda calisir.
          genel olarak class icin gerekli on ayarlamalari yapmak icin kullanilir

          birden fazla static block varsa
          yukaridan asagiya dogru sirali olarak calisir.
         */
        System.out.println("static block calisti");
    }

    static {

        System.out.println("Alttaki static block calisti");
    }

    {
        /*
          static olmayan blocklar ise obje olusturulurken
          constructor'dan önce calisir.
          obje icin yapilmasi gereken on ayarlamalari yapmak icin kullanilir.
         */
        System.out.println("static olmayan block calisti");
    }
}
