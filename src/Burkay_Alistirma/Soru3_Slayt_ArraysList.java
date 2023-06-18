package Burkay_Alistirma;

import java.util.ArrayList;
import java.util.List;

public class Soru3_Slayt_ArraysList {
    public static void main(String[] args) {

        //Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
        //kismini list olarak bize donduren bir method olusturun

        List<String> isimler = new ArrayList<>();
        isimler.add("ogün");
        isimler.add("Emre");
        isimler.add("Burkay");
        isimler.add("abdullah");

        System.out.println(istenmeyenHarfiSil(isimler, "a"));
    }

    public static List<String> istenmeyenHarfiSil(List<String> liste, String istenmeyenHarf){

       List<String> isimListe = new ArrayList<>();
        for (int i = 0; i < liste.size(); i++) {

            if (liste.get(i).contains(istenmeyenHarf)){

                isimListe.add(liste.get(i).replace(istenmeyenHarf,""));
            }
            else
                isimListe.add(liste.get(i));
        }

        return isimListe;
    }
}
