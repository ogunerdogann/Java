package day29_inheritance;

public class C05_Child extends C03_ParentClass {

    int c =20;
    int a;

    String s = "Child Class";
    String m;

    public void method1(){
        System.out.println("Child class method1 calisti");
    }

    public static void main(String[] args) {

        // child class'tan bir obje olusturalim
        // ve özelliklerini yazdiralim.

        C05_Child obj = new C05_Child();
        System.out.println(obj.a); //0
        System.out.println(obj.c); // 20
        System.out.println(obj.b); //0
        System.out.println(obj.m); //null
        System.out.println(obj.s); //Child Class

        obj.method1(); //Child class method1 calisti
        obj.method2(); //Parent method2 calisti
    }
}
