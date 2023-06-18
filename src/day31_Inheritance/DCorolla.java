package day31_Inheritance;

public class DCorolla extends CToyota{

    String str3="Corolla";

    DCorolla(){
        System.out.println("Parametresiz Corolla constructor'i calisti!");
    }

    DCorolla(int sayi){
        //super(8);
        this();
        System.out.println("Int Parametreli Corolla constructor'i calisti!");
    }

    public static void main(String[] args) {

        DCorolla obj1 = new DCorolla(5); //
    }

    /*

      Biz görünür bir constructor olusturdugumuzda Java'nin
      default constructor'i silmesine benzer olarak

      Extend keywod kullanilmis bir class'daki
      herhangi bir constructor'in ilk  satirinda
      gözle görünür bir constructor call yazilmissa
      Java default olarak koydugu super constructor call'i siler.


      Bir constructor'in icinde sadece bir tane constructor call
      olabilir, o da ilk satirda olmak zorundadir!

      Eger this(parametre) veya super(parametre) ile constructor call yaptigimizda
      yazdigimiz argüment ile uyumlu parametreye sahip bir constructor
      yoksa Java CTE verir!
     */
}
