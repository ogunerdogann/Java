package day28_accessModifier_encapsulation;

public class C01 {

    String str; // class level'daki her class üyesinin access modifier'i olur.
                // eger access modifier görünmüyorsa Java o class üyesini default access modifier olarak isaretler.
    public int sayi;
    static String s;
    public static int a;
    private int b;
    private static int c;
    public int d;


    public static void main(String[] args) {

        int sayi=10;
        //int sayi2=20;
        //static String b;
        // bir method icerisinde public, protected, private gibi access modifier'lar
        // veya static keyword KULLANILAMAZ!!!

        //System.out.println(b); b static degil!
        System.out.println(c);

        //str="Java"; static
        s="hava";
    }
    void method1(){

        System.out.println(b);
        System.out.println(c);

        str="Java";
        s="hava";
    }

    static void method2(){


    }

    public void method3(){


    }
}
