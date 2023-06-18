package day33_Polymorphism;

public class BChild extends AParent{

    @Override
    void method1() {
        //super.method1();
        // burada super. olursa hem child class'daki
        // hem de super class'daki method1 calisir.
    }

    void method2(){

        /*

          Bir method override edildiginde child class'da
          @Override notasyonu KULLANILABILIR!

          kullanmak veya kullanmamak arasinda
          pratikte söyle bir sonuc olusur;

          eger notasyon kullanilirsa
          iki method arasindaki iliski takip edilir.
          parent class'daki method silinirse
          notasyon(@Override) CTE verir.

          notasyon yoksa parent class'daki
          overridden method silinirse bir hata vermez,
          CTE olusmaz.

         */

    }

    Integer method3(){
        /*
        Overridden method ile overriding method'un
        isim ve signature'lari ayni olmalidir.

        return type ve access modifier
        signature'a dahil degildir
        ancak overriding'de bunlarla ilgili de kurallar vardir.


        1-access modofier kurali:
            child parent'i kisitlayamaz

            eger overridden ve overriding methodlari
            private yaparsak bu iki method BAGIMSIZ OLARAK calisir
            aralarinda override islemi olmaz.

        2-return type kurali
            return type primitive veya void ise
            iki method'un return type'i ayni olmalidir.

            non-primitive oldugunda ya ayni olmali
            veya parent class'daki return type child
            class'daki return type'in parent'i olmali!
            (Covariant data)

         */
        return 5;
    }
}
