package day31_Inheritance;

public class Hemsire extends FMuhasebe{

    String unvan = "Hemsire";

    public void standartMaas(){
        System.out.println("Hemsireler minimum 10.000 Tl alir");
    }

    public void özelSigorta(){
        System.out.println("Hemsirelerin sigorta katki payi ücreti 600 TL");
    }

    public void nobetÜcreti(int nobetSayisi){
        System.out.println(nobetSayisi*200);
    }


    public static void main(String[] args) {

    Hemsire hemsire = new Hemsire();
    hemsire.method();

    }

    public void method() {

        Hemsire hemsire = new Hemsire(); //default constructor kullanir
        System.out.println(hemsire.unvan); //Hemsire
        System.out.println(super.unvan); //personel ünvan belirtilmemis
        System.out.println(this.sgkNo); //önce bu class'i kontrol eder, yoksa parent'e gider - Calisan sgk no belirtilmedi
        System.out.println(super.sgkNo); //direk parent'a gider  - Calisan sgk no belirtilmedi
        this.standartMaas(); //Hemsireler minimum 10.000 Tl alir
        this.fazlaMesai(3); //600
        super.fazlaMesai(4); //800
        this.özelSigorta(); //Hemsirelerin sigorta katki payi ücreti 600 TL
        super.özelSigorta(); //Personelden katki payi alinarak özel sigorta yapilir.

    }
}
