package day09_10_String_Manipulations;

public class C08_startsWith_metodu {
    public static void main(String[] args) {

        String str="Java harika";
        System.out.println(str.startsWith("java")); // false burada da ignorecase yok
        System.out.println(str.startsWith("Ja")); //true
        System.out.println(str.startsWith(str)); //true
        System.out.println(""); // true verir
        System.out.println(str.startsWith("a",3)); // bu Stringin 3. karakterinden itibaren a ile mi baslar? Cikti:true


    }
}
