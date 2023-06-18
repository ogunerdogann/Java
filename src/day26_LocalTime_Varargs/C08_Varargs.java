package day26_LocalTime_Varargs;

import java.util.Arrays;

public class C08_Varargs {
    public static void main(String[] args) {

        topla(3,4); //7
        topla(3,4,5); //12
        topla(3,4,5,6); //18
        topla(1,2,3,4,5,6,7,8,9); //45

    }

    public static void topla(int... a){
        System.out.println(Arrays.toString(a));

        int toplam=0;

        for (int each:a
             ) {
            toplam += each;
        }
        System.out.println("Toplam: "+toplam);
    }

    /*

      Java'da bir method parametrelerine uygun argümentlere sahip method call
      oldugunda calisir.

      Örnegin iki int parametre varsa
      sadece 2 int argüment ile methodCall yapildiginda calisir.

      Java ayni data türüne sahip olmak sartiyla
      parametre sayisini esnek tutabilmek icin varargs olusturmustur.

      Varargs bir ARRAY'dir.

      Dolayisiyla method'da array elementlerini
      istedigimiz isleme uygun olarak kullanabiliriz.

     */
}
