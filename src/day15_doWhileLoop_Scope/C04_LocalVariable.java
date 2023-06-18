package day15_doWhileLoop_Scope;

public class C04_LocalVariable {
    public static void main(String[] args) {

        /*
        Scope= Kapsam,Alan

             1- Bir method icerisinde olusturulan variable'in scope'u o methotdur.
             Baska bir method'da kullanilamaz!
             Bu variable'lara "Local variable" denir.

             2- Her ne kadar bir method icinde olsalar da loop'larin da yri bir scope'u vardir.
             Loop icerisinde olusturulan variable'lar loop disinda kullanilamazlar!

             3- Local Variable'lari deger atamadan olusturabiliriz ancak deger atamadan kullanamayiz!
         */

        String isim="Ogün";

    }

    public static void baskaMethod(){

        System.out.println();


    }

}
