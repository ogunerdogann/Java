package day32_Inheritance_DataTypeKullanimi;

public class EChild extends DParent{

    String str= "Child";
    @Override // Yani bu class'ta bir method olusturursak
    // DParent teki method1'i gecersiz kiliyor!
    void method1() {


        System.out.println("Child method1");
    }

    // Override : gecersiz kilma
    // Overridden : gecersiz kilinan

    public static void main(String[] args) {

        EChild childC = new EChild();
        childC.method1(); //Child method1
        System.out.println(childC.str); //Child


        DParent childdP = new EChild();
        System.out.println(childdP.str); //Parent

        childdP.method1(); //Child method1
    }
}
