package day30_Inheritance;

public class BToyota extends Araba{

    String marka = "Toyota";
    String lastikler = "Lassa";
    String aku = "Inci Aku";

    @Override
    public void motor() {
        System.out.println("Toyotalar cevreci toyota motorlariyla calisir");
    }

    public void güvenlik(){
        System.out.println("Toyotalar güvenli arabalardir");
    }
}
