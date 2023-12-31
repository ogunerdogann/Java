package day18_MultiDimensionalArrays;

public class C04_MultiDimensionalArrays {
    public static void main(String[] args) {

        String siniflar[][] = {{"A","B","G","M"},{"F","P","A","V"},{"K","D","Q"}};

        //G'yi yazdirin
        System.out.println(siniflar[0][2]); //G

        //Q'yu Y yapin
        siniflar[2][2]="Y";
        System.out.println(siniflar[2][2]); //Y

        //ilk sinifin mevcudunu yazdirin.

        System.out.println(siniflar[0].length); //4

        //siniflarda toplam kac kisi oldugunu yazdirin.

        int toplamOgrenciSayisi =0;
        for (int i = 0; i < siniflar.length; i++) {
            toplamOgrenciSayisi += siniflar[i].length;
        }
        System.out.println(toplamOgrenciSayisi); //11
    }
}
