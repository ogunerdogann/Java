package day22_Constructors;

public class C05_doktorRunner {

    public static void main(String[] args) {

        C04_Doktor doktor1=new C04_Doktor();
        doktor1.isim="Kemal";
        doktor1.yas=40;


        System.out.println(doktor1.soyIsim); //null
        System.out.println(doktor1.yas); //40

        C04_Doktor doktor2=new C04_Doktor();
        System.out.println(doktor2.yas); //0

        C04_Doktor doktor3;

        // System.out.println(doktor3.yas);
        // Constructor calismadan bir obje olusturulup deger atanmasi mümkün degildir!

        System.out.println("variable'a atanmayan obje icin yas"+new C04_Doktor().yas);
    }
}
