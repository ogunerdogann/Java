package day31_Inheritance;

public class FMuhasebe extends EPersonel{

    String sgkNo ="Calisan sgk no belirtilmedi";
    boolean raporluMu;

    public void fazlaMesai(int fazlaMesaiSaati){
        System.out.println(fazlaMesaiSaati*200);
    }

    public void nobetÜcreti(int nobetSayisi){
        System.out.println(nobetSayisi*500);
    }

}
