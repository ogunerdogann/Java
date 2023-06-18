package day14_methodOverloading_While_loop;

public class C04_MethodOverloading2 {
    public static void main(String[] args) {

        /*
        Java overloading kurallari:
        1- Isim ve prametreleri ayni olan birden fazla method olusturulamaz
        2- Data türü farkli olan parametrelerin yerlerini degistirirsek Java yeni bir method olarak kabul eder.
        (int,double) yerine (double,int) 'a izin verir.

        Overloading olan class'larda Java hangi methodun calistirilacagina su sekilde karar verir;
        1-cagirilan isimde method var mi? //bizde topla 4 tane
        2-method call'da kullanilan arguments(parantez icine yazilanlar) ile methodlardaki parametrelerin
        %100 uyumlu oldugu var mi?
        3-argument ile parametre ayni olmasa bile verilen argument'leri kabul edecek
        parametre var mi? (mesela int yerine string yazilmaz, ama int bir deger double'a atilabilir)
        4-Casting ile birden fazla methodu kullanabiliyorsa
        daha az casting ile calisacak methodu kullanir!

        Hicbiri saglanmazsa CTE verir!

        Method signature: method ismi, parametre sayisi ve parametrelerin dizilisi demektir
        public static void topla(int a, int b)  Signature= topla,int,int
        public static void topla(double sayi1, int sayi2) Signature= topla,double,int

         */

        topla(3,5);
        topla(3.4,2.3);
        topla('a','b'); //int olmasina ragmen char degerleri topladi(ASCII'de int gibi davranabilirdi!)
        topla(3.2f,4.1f); //kendisi otomatik uygun olani bulup atiyor(Ciktilara dikkat!)
        topla(3f,4);  //double ve int sayilarin toplami diye cikis verir! Kendisi uygun olani
        // ve kendisini en az yoracak olani buldu! double double da iki casting var ama double int te 1 casting var.

    }
    public static void topla(int a, int b){
        System.out.println("Iki tamsayinin toplami: "+(a+b));
    }
    public static void topla(double a, double b){
        System.out.println("Iki double toplami: "+(a+b));
    }
    public static void topla(int sayi1, double sayi2){
        System.out.println("int ve double sayilarin toplami: "+(sayi1+sayi2));
    }
    public static void topla(double sayi1, int sayi2){
        System.out.println("double ve int sayilarin toplami: "+(sayi1+sayi2));
    }
}
