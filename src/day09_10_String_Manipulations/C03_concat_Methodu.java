package day09_10_String_Manipulations;

public class C03_concat_Methodu {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Candir";
        String str3=" ";

        System.out.println(str1+str3+str2); //Cikti:Java Candir
        System.out.println(str1.concat(str3).concat(str2)); //Cikti:Java Candir

    }
}
