package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_IstenmeyeniSil {
    public static void main(String[] args) {

        //Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
        //kismini list olarak bize donduren bir method olusturun

        List<String> liste = C04_KullaniciyaListeOlusturtmak.kullaniciyaListOlusturtma();
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen kullanilmasini istemediginiz harfi giriniz: ");
        String istenmeyenHarf = scan.next().substring(0,1); //Sadece ilk harfi alacagiz

        List<String> ayiklanmisHarf = istenmeyenHarfIcerenleriSil(liste,istenmeyenHarf);

    }
    public static List<String> istenmeyenHarfIcerenleriSil(List<String> liste, String istenmeyenHarf){


        List<String> kalanlarListesi = new ArrayList<>();

        for (int i = 0; i < liste.size(); i++) {

            if (!liste.get(i).contains(istenmeyenHarf)){
                kalanlarListesi.add(liste.get(i));

            }
        }
        return kalanlarListesi;

    }
}
