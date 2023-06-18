package day09_10_String_Manipulations;

public class C06_substring_Methodu {
    public static void main(String[] args) {

        /*
        substring in iki türlüsü var. Birincide sadece baslangic indexini giriyorsun
        ikincide baslangic ve bitis index leri var.
         */

        String str="Java ne kadar güzel";
        System.out.println(str.substring(8)); //kadar güzel
        System.out.println(str.substring(0)); //0. indexten sonuna kadar yazdirir Cikti: Java ne kadar güzel
        System.out.println(str.substring(str.length()-3)); //baslangic indexi str.length()-3 olacak Cikti: zel
        System.out.println(str.substring(str.length())); //birsey yazdirmaz cünkü 19. karakter son ve ondan sonra hicbirsey gelmiyor
        System.out.println(str.substring(4,str.length())); //4. indexten(4. dahil degil) strnin uzunluguncu indexe kadar yazdirir. Cikti: ne kadar güzel
        System.out.println(str.substring(str.length()-5,str.length())); //uzunlugu-5v(bosluk ama bosluk dahil degil) itibaren sonuna kadar yazdirir. Cikti:guzel
        System.out.println(str.substring(5,6)); // 5. indexten (5 dahil) 6. ya kadar(6 dahil degil!) yazdirir. Cikti:n
        System.out.println(str.charAt(5)); //5. indexi yazdirir
        System.out.println(str.substring(2,2)); //Cikti:hiclik
        //System.out.println(str.substring(5,1)); //hata verir. Geriye dogru olmaz. Run Time Error

    }
}
