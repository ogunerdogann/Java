package day21_ArrayListis_ForEachLoop;

import java.util.Arrays;

public class C05_KacHarfKullanilmis {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        //kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        String cumle = "Yatin kalkin Java calisin";
        String istenenHarf="x";

        String[] karakterler = cumle.split("");

        System.out.println(Arrays.toString(karakterler));

        int sayac=0;
        for (String each: karakterler
             ) {
            if (each.equalsIgnoreCase(istenenHarf)){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("Harf cümlede kullanilmamis!");

        }
        else System.out.println("Istenen harf cümlede "+sayac+" defa kullanilmis!");
    }
}
