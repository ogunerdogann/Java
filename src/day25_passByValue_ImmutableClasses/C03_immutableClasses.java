package day25_passByValue_ImmutableClasses;

public class C03_immutableClasses {
    public static void main(String[] args) {

        /*
           Java'da bir class ve o class'tan olusturulan objeler
           ya mutable'dir ya da immutable'dir.

           Java metinsel ifadeleri atayabilecegimiz 3 class olusturmustur.
           String --- immutable
           StringBuilder --- mutable
           StringBuffer --- mutable

           Immutable bir class'tan olusturulan objeler de immutabe'dir.
           String immutable oldugundan ayni str objesine yeni deger atandiginda Java
           eski degeri DEGISTIREMEZ.
           Bunun yerine istenen yeni degere sahip yeni bir obje olusturur ve str'in
           pointer'ini yeni objeye yöneltir.

           Kullanilmayan eski objeler garbage collector tarafindan toplanmak
           üzere beklenir.

         */

        String str= "Java candir";
        str=str.toLowerCase();

        System.out.println(str); //java candir

        str = str.toUpperCase();
        System.out.println(str); //JAVA CANDIR

        // Asagidaki kod calistiginda
        // Java kac obje olusturur?

        // Cevap: s'in ilk degeri+100 tane for'dan gelen=101
        String s="Hava";

        for (int i = 0; i < 100; i++) {
            s=s+".";
        }
        System.out.println(s);
        //Hava....................................................................................................
        // son halini yazdirir. Önceki halleri garbace collector'u bekler

    }
}
