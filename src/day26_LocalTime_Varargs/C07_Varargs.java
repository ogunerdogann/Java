package day26_LocalTime_Varargs;

public class C07_Varargs {
    public static void main(String[] args) {

        // verilen iki sayiyi toplayip yazdiran bir method olusturun

        topla(3,6); //9
        topla(2,3,5); //10
        topla(1,2,3,4); //10
    }

    public static void topla(int a, int b){
        System.out.println(a+b);
    }

    public static void topla(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void topla(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
}
