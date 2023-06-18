package day29_inheritance;

public class C04_Child extends C03_ParentClass {

    int c =20;
    int a;

    String s = "Child Class";
    String m;

    public void method1(){
        System.out.println("Child class method1 calisti");
    }


    public static void main(String[] args) {

        C03_ParentClass objC03 = new C03_ParentClass();
        objC03.a=20;
        objC03.b=22;
        objC03.s="p";
        objC03.t="k";
        objC03.method1(); //Parent method1 calisti
        objC03.method2(); //Parent method2 calisti

        C04_Child objC04 = new C04_Child();
        objC04.a=1;
        objC04.c=45;
        objC04.s="u";
        objC04.m="r";
        objC04.method1(); //Child class method1 calisti

        /*

          C04 class'ini C03'e child yapinca
          child class'inda olmayip parent class'ta olan
          b,t ve method2 özellik olarak objC04'e eklendi.

         */

        objC04.method2(); //Parent method2 calisti
        objC04.b=89;
        objC04.t="Child oldu";

        /*

          Java'da parent class'lar child edilmez,
          Child class'lar parent edilir.

        Bir class'in baska bir class'daki tüm özellikleri otomatik olarak
        edinmesini istiyorsak class'imizi extend keyword ile o class'a child yapariz.
         */


    }
}
