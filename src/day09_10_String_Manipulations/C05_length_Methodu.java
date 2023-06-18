package day09_10_String_Manipulations;

public class C05_length_Methodu {
    public static void main(String[] args) {

        String str="Java gün gectikce güzellesiyor";

        //bu cümledeki karakter sayisini yazdirin

        System.out.println(str.length()); //Cikti:30
        System.out.println(str.charAt(str.length()-1)); //son karakteri yazdirir. Islem önceligine dikkat!

        //sondan ücüncü karakteri yazdirin

        System.out.println(str.charAt(str.length()-3)); //sondan ücüncü karakter Cikti:y


    }
}
