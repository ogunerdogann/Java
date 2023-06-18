package day09_10_String_Manipulations;

public class C11_lastIndexOf_Methodu {
    public static void main(String[] args) {

        String str="Java bazen beyin yakar";
        System.out.println(str.lastIndexOf("a")); //20 sondan baslayarak ilk a nin indexi

        System.out.println(str.indexOf("a", 2)); //3
        System.out.println(str.lastIndexOf("a", 19)); //18 Sondan baslayarak 19. indexten geriye dogru isaretler,ilk cikan a nin indexini verir.

        System.out.println(str.indexOf("a", 4)); //6
        System.out.println(str.lastIndexOf("a", 17)); //6

        System.out.println(str.indexOf('e')); //8
        System.out.println(str.lastIndexOf('e')); //12

    }
}
