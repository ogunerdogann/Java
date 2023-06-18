package day30_Inheritance;

public class CToyotaInsignia extends BToyota{


    String lastik = "Lassa 205-55-15";
    public void motor(){
        System.out.println("Insignia araclar türkiye'de üretilen motor kullanir");
    }

    String model = "Insignia";
    String yakit = "Insignia dizel benzinli veya elektrikli olabilir";
    public void üretimYeri(){
        System.out.println("Insignia araclar türkiye'de üretilir.");
    }
    public static void main(String[] args) {

        CToyotaInsignia insignia = new CToyotaInsignia();
        System.out.println(insignia.lastik); //Lassa 205-55-15
        System.out.println(insignia.model); //Insignia
        System.out.println(insignia.yakit); //Insignia
        insignia.motor(); //Insignia
        insignia.üretimYeri(); //Insignia

        System.out.println(insignia.marka); //Toyota
        System.out.println(insignia.aku); //Toyota
        insignia.güvenlik(); //Toyota

        System.out.println(insignia.vites); //Araba


    }
}
