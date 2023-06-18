package day19_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Soru4_Slayt {
    public static void main(String[] args) {

        //Soru 4- Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci
        //sayisini bir list olarak donduren bir method olusturun.
        // Fibonacci Serisi= 1 1 2 3 5 8 13 21 34 55 89 ...

        System.out.println(fibonacciListe(10));

    }

    public static List<Integer> fibonacciListe(int fibonacciAdimSayisi) {

        List<Integer> fibo = null;   // burayi hataya tiklayinca yapti. ArrayList'i asagida olusturdu!
        //döndürdügümüz fibo sarta bagli oldugu icin hata veriyor. sart saglanmasa bile döndürmesi gereken
        // bir fibo listesi olmali!!

        if (fibonacciAdimSayisi == 0) {
            System.out.println("Adim sayisi 0 olamaz!!");
        } else {
            int ilkSayi = 1;  // Fibonacci Serisi baslangic degeri
            int ikinciSayi = 1;
            int toplam = 1;
            fibo = new ArrayList<>();
            fibo.add(toplam);  // fibonacci serisinin baslangic elemani 1'i burada atadik.

            for (int i = 1; i < fibonacciAdimSayisi; i++) { // burada adimi sayacagiz!

                fibo.add(toplam); // fibonacci serisinin ikinci elementi 1 burada atandi!
                // döngünün disinda ilk elemani eklemistik. O nedenle adim sayisi olarak döngü disinda zaten
                // bir adim atmis olduk. Bu nedenle sayaci 1'den baslattik.
                toplam = ikinciSayi + ilkSayi; // toplam=2
                ilkSayi = ikinciSayi; // ikincisayi degerim artik ilk sayi degeri olacak
                ikinciSayi = toplam; // toplam degeri de ikinci sayinin yeni degeri olacak

            }
        }

        return fibo;
    }
}
