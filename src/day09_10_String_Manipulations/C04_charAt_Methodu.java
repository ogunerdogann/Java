package day09_10_String_Manipulations;

public class C04_charAt_Methodu {
    public static void main(String[] args) {

        String str="Java Candir";
        System.out.println(str.charAt(0)); //J
        System.out.println(str.charAt(5)); // 6. Karakter =C

        //Sondan ikinci harfi yazdirin
        System.out.println(str.charAt(11-2)); // i --sondan ikinci harf
        System.out.println(str.charAt(11-1)); //r --son harf

        // System.out.println(str.charAt(11)); Hata veriyor(index sinirlarin disinda)
       // System.out.println(str.charAt(15)); Hata veriyor

    }
}
