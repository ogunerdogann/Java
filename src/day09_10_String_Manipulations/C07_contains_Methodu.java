package day09_10_String_Manipulations;

public class C07_contains_Methodu {
    public static void main(String[] args) {

        String str="Java ögren, isi kap";
        System.out.println(str.contains("Java")); //Bu str "Java" icerir mi? Cikti:true
        String s="ka";
        System.out.println(str.contains(s)); //str s yi icerir mi? Cikti:true
        System.out.println(str.contains("a")); //true

        // contains bir harfin kac tane olduguyla ilgilenmez. Sadece olup olmadigiyla ilgilenir.

        System.out.println(str.contains(" ")); //true
        System.out.println(str.contains("java")); // false "J" büyük harf. Burada ignorecase yok!

    }
}
