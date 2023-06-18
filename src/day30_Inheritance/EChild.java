package day30_Inheritance;

public class EChild extends DParentsAccessModifier{

    static int sayiChildStatic;

    public static void main(String[] args) {

        // inheritance'da private class üyeleri inherit edilemez!

        EChild eChild= new EChild();
        System.out.println(eChild.sayiDefault);
        System.out.println(eChild.sayiProtected);
        System.out.println(eChild.sayiPublic);


        //icinde bulundugumuz class'taki static variable'lar
        //obje üzerinden otomatik gelmez
        //ama manuel yazdigimizda Java kabullenir

        System.out.println(eChild.sayiChildStatic);

        //ancak parent class'taki static variable'lar
        //obje üzerinden KULLANILAMAZ!
        //eChild.sayiStaticPrivate;

        System.out.println(DParentsAccessModifier.sayiStaticDefault);
        //Bu kullanim icin inheritance'a gerek yok
        // her hangi bir class'daki static variable'i
        //classIsmi.staticVariableIsmi seklinde kullanabiliriz.




    }
}
