package day26_LocalTime_Varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime saat1 = LocalTime.of(20,15);
        System.out.println(saat1); //20:15

        LocalTime saat = LocalTime.now();
        System.out.println(saat); //12:16:47.174605700

        // LocalTime objesi olan saat variable'i canli bir saat degildir!
        // olusturuldugu andaki local time'i sistemden alip kaydettigimiz bir degerdir.
        // kodun ilerleyen kisminda ne kadar süre gectigini ögrenmek icin
        // saati yeniden almamiz gerekirse, yeni bir LocalTime objesi daha olusturmamiz gerekir.

        System.out.println(saat.getHour()); //12
        // get methodlari LocalTime objesinin saat, dakika, saniye, nanosaniye degerlerini getirir.

        System.out.println(saat.plusHours(2).plusMinutes(10)); //14:31:13.426445100

        System.out.println(saat.minusHours(1).minusMinutes(20)); //11:01:13.426445100

        System.out.println(saat.withSecond(0).withNano(0)); //12:21

        System.out.println(saat.compareTo(saat1)); //-1 ayni degil geride
        System.out.println(saat.compareTo(saat)); //0 ayni

        System.out.println(saat.isAfter(saat1)); //false
        System.out.println(saat.isBefore(saat1)); //true

        System.out.println(saat.toSecondOfDay()); // günün 44794. saniyesi

    }
}
