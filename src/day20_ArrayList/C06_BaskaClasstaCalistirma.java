package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_BaskaClasstaCalistirma {
    public static void main(String[] args) {

        // C05'deki istenmeyenleri sil methodunu burada kullanin.

        List<String> ürünler =new ArrayList<>();
        ürünler.add("Nutella");
        ürünler.add("Cikolatali Gofret");
        ürünler.add("Cokoprens");
        ürünler.add("Cokomel");

        String istenmeyenHarf="o";

        System.out.println(C05_IstenmeyeniSil.istenmeyenHarfIcerenleriSil(ürünler, istenmeyenHarf));

    }
}
