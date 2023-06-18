package day30_Inheritance;

public class HChild extends GParent {

    protected int sayiChild;

    HChild(){
        System.out.println("Child class constructor calisti");
    }

    public static void main(String[] args) {

        HChild objChild = new HChild();
        System.out.println(objChild.sayiChild);

        System.out.println(objChild.sayiParent);

        System.out.println(objChild.sayiGrandParent);

        /*

          Child Class'tan olusturdugumuz bir obje
          parent ve grandParent class'larindaki tüm özelliklere sahip olur.

          Bir obje olusturuldugunda ilk degerleri alabilmesi icin
          MUTLAKA bir constructor calismalidir.

          Constructor call bizim cok kullandigimiz bir
          özellik degildir ancak inheritance'i tam anlayabilmek icin
          constructor call konusunu bilmemiz lazim.

          Bu class'tan obje olusturmak icin Hchild constructor'ini kullandik
          Ama objemiz parent ve grandParent'teki özellikleri de sahiplendi.

         Bu nasil olur?

         Her ne kadar objeyi child class'tan olustursak da
         bu objenin parent ve grandParent class'larindaki özellikleri
         alabilmesi icin o class'larin constructor'lari da calismak ZORUNDADIR!

         Java bu mecburi calismayi saglayabilmek icin cok özel bir sistem gelistirmistir.

         Bunun adi super() : super constructor call'dur.

         */

    }
}
