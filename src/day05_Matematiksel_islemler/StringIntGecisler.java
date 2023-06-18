package day05_Matematiksel_islemler;

public class StringIntGecisler {
    public static void main(String[] args) {

        String s1="423";
        int sayi= Integer.parseInt(s1);
        System.out.println(sayi++);
        System.out.println(sayi);

        int a=20;
        int b=40;

        //bu iki sayiyi kullanarak 2040 yazdirin

        System.out.println(a+""+b);  //2040
        System.out.println(""+a+b);  //2040

    }
}
