package day19_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru5_Slayt {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
        //bir liste olarak bize donduren bir method olusturun.

        System.out.println(fibonacciListe2());

    }
    public static List<Integer> fibonacciListe2() {

        List<Integer> fibo = null;   // burayi hataya tiklayinca yapti. ArrayList'i asagida olusturdu!
        //döndürdügümüz fibo sarta bagli oldugu icin hata veriyor. sart saglanmasa bile döndürmesi gereken
        // bir fibo listesi olmali!!

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz: ");
        int fibonacciSinir = scan.nextInt();

        if (fibonacciSinir <= 0) {
            System.out.println("Gecersiz parametre girdiniz!!!");
        } else {
            int ilkSayi = 1;  // Fibonacci Serisi baslangic degeri
            int ikinciSayi = 1;
            int toplam = 1;
            fibo = new ArrayList<>();
            fibo.add(toplam);  // fibonacci serisinin baslangic elemani 1'i burada atadik.

            for (int i = 0; i <= fibonacciSinir; i++) { // burada adimi sayacagiz!

                fibo.add(toplam); // fibonacci serisinin ikinci elementi 1 burada atandi!
                // döngünün disinda ilk elemani eklemistik. O nedenle adim sayisi olarak döngü disinda zaten
                // bir adim atmis olduk. Bu nedenle sayaci 1'den baslattik.
                toplam = ikinciSayi + ilkSayi; // toplam=2
                if (toplam >= fibonacciSinir){
                    break;
                }
                ilkSayi = ikinciSayi; // ikincisayi degerim artik ilk sayi degeri olacak
                ikinciSayi = toplam; // toplam degeri de ikinci sayinin yeni degeri olacak

            }
        }

        return fibo;
    }
}
