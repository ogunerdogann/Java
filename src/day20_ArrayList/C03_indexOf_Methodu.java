package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf_Methodu {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();
        isimler.add("Kübra");
        isimler.add("Mustafa");
        isimler.add("Emre");
        isimler.add("Ferhat");
        isimler.add("Erdal");
        isimler.add("Mustafa");

        System.out.println(isimler.get(2)); // Emre

        //Ferhat'in index'ini yazdirin

        System.out.println(isimler.indexOf("Ferhat")); //3
        System.out.println(isimler.lastIndexOf("Mustafa")); //5 Kac tane Mustafa varsa aramaya sondan baslar ve son mustafa'nin index'ini verir.
        System.out.println(isimler.lastIndexOf("Kübra")); //0
        System.out.println(isimler.lastIndexOf("Ogün")); //-1 Ogün ismi listede yok o yüzden -1 verir.

    }
}
