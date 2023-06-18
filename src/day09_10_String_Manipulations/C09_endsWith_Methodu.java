package day09_10_String_Manipulations;

public class C09_endsWith_Methodu {
    public static void main(String[] args) {

        String str="Java harika";
        System.out.println(str.endsWith("a"));   //true
        System.out.println(str.endsWith("ka"));  //true
        System.out.println(str.endsWith("Java harika")); //true
        System.out.println(str.endsWith("")); //true
        System.out.println(str.endsWith(str.substring(str.length()-1))); //true  (Son karakterle mi bitiyor?)


    }
}
