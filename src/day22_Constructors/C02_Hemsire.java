package day22_Constructors;

public class C02_Hemsire {


        /*
          Örnegin bir hastane programinda hastanede calisacak hemsirelerin hangi bilgilerini tutmak istiyorsak,
          hangi method'lari hemsireler icin kullanmak istiyorsak
          bir hemsire class'i olusturup
          tüm bu özellikleri (variable ve method'lari) o class'ta olustururuz.

          Programda ne zaman bir hemsireye ihtiyac duyulsa bu hemsire class'indan
          obje olustururuz. Böylece otomatik olarak tüm
          özelliklere sahip olur.

          Eger biz istedigimiz parametrelere sahip bir constructor olusturmazsak JAVA
          class'tan obje olusturulabilmesi icin class'a default bir constructor atar.

          Default constructor GÖRÜNMEZ!
          parametreleri yoktur, constructor body'si bostur.

          C02_Hemsire(){      Görünmez defaul constructor görünseydi böyle olurdu

          }

            Biz de istedigimiz parametrelere sahip istefigimiz kadar
            constructor olusturabiliriz.

            COK ÖNEMLI!: Eger biz bir constructor olusturursak
                         yani class'ta gözle görünen bir constructor varsa
                         JAVA default constructor'i siler!
                         Bizim olusturdugumuz hicbir constructor'a default constructor denmez!

         */

        String isim;
        String soyIsim;
        String telNo;
        String adres;
        int yas;
        boolean izindeMi;
        char evliMi;
        int ekMesaiUcreti=20;




    public int mesaiÜcretiHesapla(int mesaiSaati){

        return mesaiSaati*ekMesaiUcreti;


    }
}
