package day26_LocalTime_Varargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class C06_PeriodOfTime {
    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1995,10,26);
        LocalDate bugün = LocalDate.now();

        System.out.println("Yas: "+Period.between(dogumTarihi, bugün).getYears()); //27
        System.out.println("Gün: "+Period.between(dogumTarihi, bugün).getDays()); // 17



    }
}
