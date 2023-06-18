package day31_Inheritance;

import day30_Inheritance.GParent;

public class AChild extends GParent {

    String childStr;
    AChild(){
        System.out.println("Child class constructor calisti");
    }

    public static void main(String[] args) {

        //System.out.println(childStr); static degil
        // System.out.println(sayiParent); static degil

        AChild objeChild = new AChild();



        /*

           Java'da inheritance kullanirken child class'daki obje parent class'lardaki tüm
           özelliklere sahip olur. Bunu saglayan java mekanizmasi super() constructor call'dir.

           Extends keyword kullanan bir class'da
           olusturulan herbir contructor'in ilk satirinda
           biz görmesek bile super constructor call vardir.

           super() ==> Önce parent classa gidip oradaki parametresiz constructor'i calistir demektir.

           Bu sekilde child class'daki constructor calistiginda
           extends keyword kullanmayan parent buluncaya kadar
           parent class'lara gider.

         */

    }
}
