package day13_Method_Olusturma;

public class C04_StringiTerseCevirme {
    public static void main(String[] args) {
        // Verilen bir String'i tersine cevirip bize
        // döndüren bir method olusturun.

        String giris="Java süpersin!";
        System.out.println(terscevirme(giris));
        System.out.println(terscevirme("Ogün Erdogan"));
    }
    public static String terscevirme(String metin){

        String tersmetin="";
        for (int i = metin.length()-1; i >=0 ; i--) {
            tersmetin+=metin.charAt(i);
        }
        return tersmetin;
    }
}
