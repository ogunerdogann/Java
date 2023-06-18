package Burkay_Alistirma;

import java.util.ArrayList;
import java.util.List;

public class Soru4_Slayt_ArraysList {
    public static void main(String[] args) {

        //Soru 4- Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci
       // sayisini bir list olarak donduren bir method olusturun.
        //1 1 2 3 5 8 13 21 34 55 ...

        System.out.println(fiboDöndür(10));
    }

    public static List<Integer> fiboDöndür(int adim){

        List<Integer> fibo = new ArrayList<>();
        int ilkSayi=1;
        int ikinciSayi=1;
        int toplam=0;
        fibo.add(ilkSayi);
        fibo.add(ikinciSayi);

        for (int i = 2; i < adim; i++) {

            toplam=ilkSayi+ikinciSayi;
            fibo.add(toplam);
            ilkSayi=ikinciSayi;
            ikinciSayi=toplam;

        }

       return fibo;
    }
}
