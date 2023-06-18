package day30_Inheritance;

public class Araba {

    // marka gözetmeksizin tüm arabalarin sahip olacagi
    //özellikleri bu class'a koyariz

    String marka = "Tüm arabalarin markasi olur";
    String model = "Tüm arabalarin modeli olur";
    String vites = "Tüm arabalarin vitesi olur";
    String yakit = "Tüm arabalar yakitla calisir";

    public void UretimYeri(){
        System.out.println("Tüm arabalar bir fabrikada üretilir");
    }

    public void motor(){
        System.out.println("Tüm arabalar motorla calisir");
    }
}
