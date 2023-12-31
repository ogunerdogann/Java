package day25_passByValue_ImmutableClasses;

import java.time.LocalTime;

public class C05_DateTime {
    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();
        System.out.println(saat); //11:34:19.945828300

        System.out.println(saat.getNano()); //945828300

        //bir loop ile 1 den 10.000 e kadar olan sayilari toplayin.
        // ve bu islemin kac nanosaniye sürdügünü bulun.

        int toplam=0;
        int basSüresiNano = saat.getNano();

        for (int i = 1; i <= 10000; i++) {

            toplam+=i;
        }
        LocalTime saatSon = LocalTime.now();  // simdiyi aldigi icin bitis süresi adina yeniden almamiz lazim!
        int bitSüresiNano = saatSon.getNano();

        System.out.println("islem süresi: "+(bitSüresiNano-basSüresiNano)); //3997800

    }
}
