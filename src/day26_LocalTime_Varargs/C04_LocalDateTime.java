package day26_LocalTime_Varargs;

import java.time.LocalDateTime;

public class C04_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt); //2023-03-15T12:45:20.099399400

        System.out.println(ldt.toLocalDate()); //2023-03-15

    }
}
