package day31_Inheritance;

public class BAraba {

    String str1 = "Araba";

    BAraba(){
        System.out.println("Araba parametresiz constructor calisti!");
    }

    BAraba(String str){
        System.out.println("Araba str parametreli constructor calisti!");
    }

    BAraba(int a, int b){
        System.out.println("Araba iki int parametreli contructor calisti!");
    }
}
