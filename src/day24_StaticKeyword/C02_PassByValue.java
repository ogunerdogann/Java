package day24_StaticKeyword;

public class C02_PassByValue {
    public static void main(String[] args) {

        double fiyat=200;

        /*
        double fiyat=100;
        String fiyat="Java PassByValue kullanir";


        Java ayni method icerisinde ayni isimde birden fazla variable
        olusturulmasina izin vermez!
         */

        indirimYap10(fiyat); //180
        System.out.println("methodcall'dan sonra fiyat "+fiyat); //200 passByValue'nin olayi bu. Method icindeki degisiklik method icinde kalir!
        indirimYap25(fiyat); //150
        System.out.println("2. MethodCall'dan sonra fiyat "+fiyat); //200
    }
    public static void indirimYap10(double fiyat){ // double fiyat=degeri methodun cagirildigi yerden

        fiyat=fiyat*(0.9);
        System.out.println("%10 indirimli fiyat: "+fiyat);
    }

    public static void indirimYap25(double fiyat){
        fiyat=fiyat*(0.75);
        System.out.println("%10 indirimli fiyat: "+fiyat);
    }
}
