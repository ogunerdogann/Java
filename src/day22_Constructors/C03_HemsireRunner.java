package day22_Constructors;

public class C03_HemsireRunner {
    public static void main(String[] args) {

        /*
          Bir obje olustururken parametre olarak hicbir deger girilmemisse
          olusturulan obje, olusturuldugu class'daki variable'lara atanan degerleri alir.
          Eger obje olusturulan class'da deger atamasi yoksa JAVA default degerleri atar.
         */

     C02_Hemsire hemsire1 = new C02_Hemsire();
        System.out.println(hemsire1.isim);   //null
        System.out.println(hemsire1.evliMi); // hiclik
        System.out.println(hemsire1.yas);  //0

        hemsire1.isim="Tuba";
        hemsire1.yas=20;

        System.out.println(hemsire1.isim); // Tuba
        System.out.println(hemsire1.yas); //20
    }
}
