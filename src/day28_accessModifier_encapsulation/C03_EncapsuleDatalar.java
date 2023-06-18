package day28_accessModifier_encapsulation;

public class C03_EncapsuleDatalar {

    static private String isim = "Yildiz pazarlama";

   private int satisTutari;

    public int toplamSatis;


    public static String getIsim() { //Getter
        return isim;
    }

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatis += satisTutari;
    }
}
