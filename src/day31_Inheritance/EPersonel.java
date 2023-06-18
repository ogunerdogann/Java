package day31_Inheritance;

public class EPersonel {

    String isim ="Isim belirtilmemis";
    String unvan = "personel ünvan belirtilmemis";
    boolean izindeMi;

    public void standartMaas(){

        System.out.println("Personel asgari ücreti: "+8500);
    }

    public void özelSigorta(){
        System.out.println("Personelden katki payi alinarak özel sigorta yapilir.");
    }
}
