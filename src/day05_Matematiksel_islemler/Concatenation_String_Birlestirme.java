package day05_Matematiksel_islemler;

public class Concatenation_String_Birlestirme {
    public static void main(String[] args) {

        //Bir String baska bir String veya baska türden bir data türü ile
        // + isareti ile birlestirilebilir.

        String a= "JAVA";
        String b="GÜZELDIR";

        System.out.println(a+b);     //JAVAGÜZELDIR
        System.out.println(a+" "+b); //JAVA GÜZELDIR

        int c=10;
        int d=20;
        System.out.println(a+c+d); //JAVA1020
        System.out.println(c+d+a); //30JAVA       ISLEM ÖNCELIGI!!
        System.out.println(a+(c+d)); //JAVA30
        System.out.println(a+c*d); //JAVA200
        System.out.println(d+c+a); //30JAVA      ISLEM ÖNCELIGI SOLDAN SAGA

        //Eger String ile baska türdeki bir data türündeki bir deger toplanirsa
        // JAVA sonucu String yapar

    }
}
