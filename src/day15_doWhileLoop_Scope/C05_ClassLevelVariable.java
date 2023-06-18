package day15_doWhileLoop_Scope;


import com.sun.security.jgss.GSSUtil;

public class C05_ClassLevelVariable {


     /*
        Bir class icinde tüm methodlarin erisebilecegi variable'lar istenirse
        Class Level'da (Class'in icinde, methodlarin disinda) olusturulmalidir.

        1- Class Level'da olusturulan variable'larin scope'u tüm class'tir.
        2- Class Level'da olusturulan variable'lara deger atanmasa bile Java onlar icin tanimlanmis
        DEFAULT DEGERLER atar.
        3- Class Level'da olusturulan variable'lar static veya instance(static olmayan) olabilir.
        4- static olarak tanimlanan variable'lar tüm method'larda direk kullanilabilir.
        5- Method static ise, icine static olmayan hicbir sey almaz. (variable, method...)

     */

    static int sayi=10;
    static String isim;
    static boolean bl;
    static char ch;
    static int in1;
    int in2;
    boolean bl2;


    public static void main(String[] args) {

        System.out.println(sayi);
        System.out.println("String: "+isim); //non-primitive türler icin null
        System.out.println("boolean= "+bl);  //false
        System.out.println("Char: "+ch);  //hiclik
        System.out.println("int: "+in1);  //0

    }

    public static void staticMethod(){
        sayi++;
        System.out.println(sayi);
    }

    public void staticOlmayanMethod(){
        sayi--;
        System.out.println(sayi);
        System.out.println(bl); //static
        System.out.println(bl2); //instance
        System.out.println(in1); //static
        System.out.println(in2); //instance
    }

}
