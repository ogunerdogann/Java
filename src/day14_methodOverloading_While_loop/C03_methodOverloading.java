package day14_methodOverloading_While_loop;

public class C03_methodOverloading {
    public static void main(String[] args) {

        /*
         Bir class'ta ayni isme sahip farkli islem yapan methodlar olabilir.
         Java bu methodlardan hangisinin calisacagina parametrelere göre karar verir.

         Bir class'ta ismi ayni, parametreleri farkli method'lar olmasina
         Method Overloading denir.
         */

        String str="Bu is olacak";
        System.out.println(str.replace("Bu is", "Java güzel"));

        System.out.println(str.replace('u', 'e')); //Be is olacak



    }
}
