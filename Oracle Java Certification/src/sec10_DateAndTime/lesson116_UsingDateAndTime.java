package sec10_DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class lesson116_UsingDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, Month.APRIL, 7);
        System.out.println(date);
        date = date.plusDays(7).plusMonths(2); //ref to new instance, DateAndTime is immutable just like string
        System.out.println(date);

        System.out.println();

        LocalTime time = LocalTime.of(7, 10, 30);
        System.out.println(time);
        time = time.minusSeconds(15).minusHours(2).minusMinutes(15); //order of minus dont matter
        System.out.println(time);
    }
}
