package day09_10_String_Manipulations;

import java.util.Scanner;

public class C10_indexOf_Methodu {
    public static void main(String[] args) {

        String str="Java cok ama cok güzel";
        System.out.println(str.indexOf("c")); //c harfinin indexi nedir? Cikti:5
        System.out.println(str.indexOf("a")); //Cikti:1 Birden fazla o harften varsa ilk buldugunun indexini verir
        System.out.println(str.indexOf("cok")); // bu durumda cok u bir paket yapar ve o paketin baslangic indexini verir. Cikti:5 (cok 5. indexten itibaren baslar)
        System.out.println(str.indexOf("cok",6)); //6.indexten itibaren cok un indexi Cikti:13 (ilk cok 5. indexten itibarendi!)
        //Burada indexOf un farkli versionunu kullandik.
        System.out.println(str.indexOf("cok",5)); //Cikti:5
        System.out.println(str.indexOf("java")); // yok o yüzden yazdirmada -1 ciktisi verecek

        System.out.println("========================");

        /*
        Soru: Verilen bir cümlede istenen String icin asagidaki cümlelerden uygun olani yazdirin.
        1-"Aradiginiz kelime cümlede bir kere kullanilmis"
        2-"Aradiginiz kelime cümlede iki kere kullanilmis"
        3-"Aradiginiz kelime cümlede ikiden fazla kullanilmis"
        4-"Aradiginiz kelime cümlede hic kullanilmamistir."
         */


        String cümle= "Yasasin java, iyi ki java ögreniyorum.";
        String kelime="Ogün";

        if (cümle.indexOf(kelime)==(-1)){
            System.out.println("Aradiginiz kelime cümlede hic kullanilmamistir.");

        }else  { //kelime cümlede kesinlikle var ama kac tane?
            int kelimeindex=cümle.indexOf(kelime); //8
            if (cümle.indexOf(kelime,kelimeindex+1)==(-1)){
                System.out.println("Aradiginiz kelime cümlede bir kere kullanilmis");
            }
            else {
                int ikinciKelimeIndex=cümle.indexOf(kelime,kelimeindex+1);
                if (cümle.indexOf(kelime,ikinciKelimeIndex+1)==(-1)){
                    System.out.println("Aradiginiz kelime cümlede iki kere kullanilmis");

                }
                else System.out.println("Aradiginiz kelime cümlede ikiden fazla kullanilmis");
            }
        }
    }
}
