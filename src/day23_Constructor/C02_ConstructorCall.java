package day23_Constructor;

public class C02_ConstructorCall {

    /*
       Java'da ihtiyac olursa bir constructor icinden baska constructor cagirilabilir.
       this(ilgili parametreler) yazarak istedigimiz constructor'i cagirabiliriz.

       Constructor call icin iki kural vardir;
       1- constructor call icinde bulundugu constructor'in ilk satirinda olmalidir!

     */

    int sayi;
    String str;

    public C02_ConstructorCall(int sayi, String str) {
        //C02_ConstructorCall();  böyle yazildiginda method call olarak algilar.
        this();  // JAVA syntax olarak constructor call icin bunu belirlemistir.
        this.sayi = sayi;
        this.str = "Java";
        System.out.println("Iki parametreli constructor calisti");
    }

    public C02_ConstructorCall(String str) {
        this(5);
        this.str = str;
        System.out.println("String parametreli constructor calisti");
    }

    public C02_ConstructorCall(int sayi) {
        this.sayi = sayi;
        System.out.println("int parametreli constructor calisti");
    }


    public C02_ConstructorCall() {
        System.out.println("Parametresiz constructor calisti");
    }

    public static void main(String[] args) {

       C02_ConstructorCall obj3 = new C02_ConstructorCall(7,"Ogün");
        System.out.println(obj3.str);
        System.out.println(obj3.sayi);

        /*
        C02_ConstructorCall obj2 = new C02_ConstructorCall("JAVA");
        System.out.println(obj2.sayi); //5
        System.out.println(obj2.str); //JAVA
        */
        // C02_ConstructorCall obj1 = new C02_ConstructorCall();

    }
}
