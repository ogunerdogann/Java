package day27_StringBuilder;

public class C02_MetniTerseCevirme {
    public static void main(String[] args) {

        // Verilen bir metni tersine ceviriniz.

        String str = "Ogün Erdogan";

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println(sb); // nagodrE nügO

    }
}
