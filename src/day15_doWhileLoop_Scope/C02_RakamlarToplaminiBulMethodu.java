package day15_doWhileLoop_Scope;

public class C02_RakamlarToplaminiBulMethodu {
    public static void main(String[] args) {

        //Verilen pozitif bir tamsayinin rakamlar toplamini bize döndüren
        //bir method olusturun.

        System.out.println(rakTop(001));


    }

    public static int rakTop(int sayi){

        int birler=0;
        int toplam=0;

        while (sayi != 0){

            birler = sayi%10;
            sayi /= 10;
            toplam += birler;
        }
        return toplam;
    }
}
