package day09_10_String_Manipulations;

public class Soru3_Slayt {
    public static void main(String[] args) {

       // Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
       //         sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
       //         input : java1 ogRe2@nMek3 #ne +Gu=zel
       // output : Java ogrenmek ne guzel.

        String input="java1 ogRe2@nMek3 #ne +Gu=zel";
        input=input.replace(" ","x");
        input=input.replaceAll("\\W","");
        input=input.replaceAll("\\d","");
        input=input.replace("x"," ");
        input=input.toLowerCase();
        System.out.println(input.substring(0,1).toUpperCase()+input.substring(1));

    }
}
