package day31_Inheritance;

public class CToyota extends BAraba{

   protected String str2 = "Toyota";

    protected CToyota(){
        this("Java");
        System.out.println("Parametresiz Toyota constructor'i calisti");
    }

    protected CToyota(int sayi){
        System.out.println("Int parametreli Toyota constructor'i calisti");
    }

   protected CToyota(String s){
        System.out.println("String parametreli Toyota constructor'i calisti");
    }
}
