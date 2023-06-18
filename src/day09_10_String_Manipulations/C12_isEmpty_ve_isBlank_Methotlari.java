package day09_10_String_Manipulations;

public class C12_isEmpty_ve_isBlank_Methotlari {
    public static void main(String[] args) {

        String str="Java Candir";

        System.out.println(str.isEmpty()); // str bos mu? Cikti: false
        System.out.println(str.isBlank()); // str spacelerden mi olusuyor? Cikti:false  (Dikkat! space iceriyor mu degil!)

        str="  ";
        System.out.println(str.isEmpty()); // str bos mu? Cikti: false
        System.out.println(str.isBlank()); // bosluk(space) lerden mi olusuyor? Cikti:true

        str="";
        System.out.println(str.isEmpty()); //true
        System.out.println(str.isBlank()); // true verir!

    }
}
