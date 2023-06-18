package day05_Matematiksel_islemler;

public class Pre_increment_Post_Increment {
    public static void main(String[] args) {

        // anin degerini 1 artirin ve yeni degerini olusturacaginiz b variable ina atayin

        int a = 5;
        a++;
        int b =a;
        System.out.println("a: " + a + " b: " + b);   //a=6 b=6

        //anin degerini b ye atayin sonra a nin degerini 1 artirin

        a=5;
        b=a;
        a++;

        System.out.println("a: " + a + " b: " + b); //a=6 b=5

        //daha kisa yol söyle

        a=5;
        b=++a; // bu önce a yi artirir sonra atama yapar
        //b=a++;  + nin yerine dikkat. Bu önce atama yapar snra artirir (a yi) a=6 b=5  POST INCREMENT
        System.out.println("a: " + a + " b: " + b); //a=6 b=6  PRE INCREMENT


        a=10;
        System.out.println(a++); // bu durumda önce yazdirir sonra degeri artirir a=11 ekran=10
        System.out.println(a); // bir önceki satirda a yi yazdirdi sonra atadi. Burada a yi 11 yazdirir

        a=10;
        System.out.println(++a); // bu durumda önce yazdirir sonra degeri artirir a=11 ekran=11
        System.out.println(a); // bir önceki satirda a yi yazdirdi sonra atadi. Burada a yi 11 yazdirir

        a=20;
        b=++a;   //PRE INCREMENT önce artirma
        System.out.println("a: " + a + " b: " + b); //a=21 b=21

        a=20;
        b=a++;  //POST INCREMENT sonra artirma
        System.out.println("a: " + a + " b: " + b); //a=21 b=20

        //1 artirirken ++ larin yeri önemli!


    }
}
