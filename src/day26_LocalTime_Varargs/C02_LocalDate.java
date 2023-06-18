package day26_LocalTime_Varargs;

import java.time.LocalDate;

public class C02_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();
        System.out.println(tarih); //2023-03-15

        System.out.println(tarih.isLeapYear()); // artik yil mi? false (4'e bölünebilen yillar)

        LocalDate tarih2 = LocalDate.of(2016,10,10);
        System.out.println(tarih2.isLeapYear()); // true

        System.out.println(tarih.getMonthValue()); // yilin 3. ayi
        System.out.println(tarih.getDayOfMonth()); // ayin kacinci günü? 15

        System.out.println(tarih.getMonth()); // MARCH

        LocalDate tarih3 = LocalDate.of(1995,10,26);
        System.out.println(tarih3.getDayOfWeek()); // THURSDAY - Persembe günü dogmusuz.

        System.out.println(tarih.isBefore(tarih3)); // false

    }
}
