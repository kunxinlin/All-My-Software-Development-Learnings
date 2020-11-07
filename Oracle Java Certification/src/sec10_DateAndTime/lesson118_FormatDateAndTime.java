package sec10_DateAndTime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

//DateTime -> String
public class lesson118_FormatDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, Month.APRIL, 14);
        LocalTime time = LocalTime.of(12, 7, 36);
        LocalDateTime dateTime = LocalDateTime.of(date, time);


        //to string representation
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));

        String s1 = dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);

        DateTimeFormatter shortForm = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumForm = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter longForm = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter fullForm = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println();
        System.out.println(shortForm.format(dateTime)); //since we only used .ofLocalizedDate it will only show date, theres one for time and DateandTime
        System.out.println(mediumForm.format(date));
        System.out.println(longForm.format(date));
        System.out.println(fullForm.format(date));
        System.out.println();

        //create custom format
        //uppercase for Month M- 1, MM - 01, MMM - Jan, MMM - January
        //d, dd, anything else will throw exception
        //y, yyy, yyyy - 2024, yy - 24, yyyyy 02024
        //m - 7min -> 7, 14min->14, mm
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd, yyyy, hh:mm"); //in between symbol is just for styling -, :, etc
        System.out.println(dateTime.format(formatter));
        System.out.println();

        //old
        SimpleDateFormat sf = new SimpleDateFormat("hh:mm");
//        System.out.println(sf.format(time)); // cant use localdate, time, datetime with this obj
        System.out.println(sf.format(new Date())); //need to use old Date class
    }
}
