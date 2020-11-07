package sec10_DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class lesson115_CreatingDateAndTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println();

        LocalDate localDate = LocalDate.of(1996, Month.APRIL, 7); //can use int for month too, or can use Month ENUM Class
        LocalTime localTime = LocalTime.of(10, 20);

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(LocalDateTime.of(localDate, localTime));

        //before java 8
        System.out.println();
        System.out.println(new Date());
    }
}
