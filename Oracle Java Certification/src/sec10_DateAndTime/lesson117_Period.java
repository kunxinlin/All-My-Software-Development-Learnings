package sec10_DateAndTime;

import java.time.*;

public class lesson117_Period {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.APRIL, 30);

        cleanCar(start, end);
        System.out.println();

        Period oneweek = Period.ofWeeks(1);
        System.out.println(start.plus(oneweek));
        System.out.println(LocalDateTime.now().plus(oneweek));
//        System.out.println(LocalTime.now().plus(period)); //doesnt have days, it will throw exception at runtime
        System.out.println();


        Period yearAndMonth = Period.ofYears(1).ofMonths(1);//it will only take the last method since its static
        System.out.println(yearAndMonth);

        Period yearAndMonth2 = Period.ofMonths(1).ofYears(1);
        System.out.println(yearAndMonth2);

        Period yearAndMonth3 = Period.of(1, 1, 0);
        System.out.println(yearAndMonth3);

        System.out.println();
        cleanCar(start, end, oneweek);
    }

    public static void cleanCar(LocalDate start , LocalDate end){
        while(start.isBefore(end)){
            System.out.println("Need to clean car on date= " + start);
            start = start.plusMonths(1);
        }
    }

    public static void cleanCar(LocalDate start , LocalDate end, Period period){
        while(start.isBefore(end)){
            System.out.println("Need to clean car on date= " + start);
            start = start.plus(period);
        }
    }
}
