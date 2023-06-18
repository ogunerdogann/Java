package day05_Matematiksel_islemler;

public class RelationalOperators_Karsilastirma_Ifadeleri {
    public static void main(String[] args) {

        // cift esittir == isareti birbirine esit mi sorusunu sorar true ya da false döndürür

        int a=10;
        int b=20;
        System.out.println(a==b); // false
        System.out.println(a==10); //true
        boolean c= a*10==20;
        System.out.println(c);  //false   Islem önceligi esittirin sagi

        // Esit degil midir sorusu icin !=
        System.out.println(a!=10); //false
        System.out.println(a!=b); //true

        // ! isareti hangi ifadenin önüne gelirse gelsin tam tersi soruyu sorar




        System.out.println(!(5==5)); //false
        System.out.println(!(15-5==10)); //false

        // And - Ve Operatörü &&,&

        // && operatoru 2 boolean ifadenin ikisi de true ise sonucu true yapar
        // bunun disindaki tüm durumlarda sonucu false yapar
        // && operatorü mükemmelliyetcidir

        System.out.println(a>5 && b<30); // true
        System.out.println(a-5!=20 && b+5!=10); //true
        System.out.println(c=15>=b && a<0); //15 bye esit veya b den büyük mü =c=false o nedenle false
        c=a>=b && 3*a<4*b;    //a bden büyük degil c=false
        System.out.println(c); //false


        // && ve & arasindaki fark
        //&& operatoru islemi yaparken ilk false degeri ile karsilastiginda diger islemleri incelemez
        // ve sonucu direk false yapar
        // & operatoru ise false degeriyle karsilassa bile islemi sonuna kadar götürür ve ondan sonra false yapar.
        // bu nedenle && operatoru & e göre daha HIZLIDIR!


        // OR - VEYA operatoru  ||
        // hepsi false ise sonuc false olur bir tane bile true varsa sonuc true olur

        System.out.println(a==b || b!=23); //true
        System.out.println(a<=b-5 || a>b-8); //true
        System.out.println(a!=b-10 || c); //false

    }
}
