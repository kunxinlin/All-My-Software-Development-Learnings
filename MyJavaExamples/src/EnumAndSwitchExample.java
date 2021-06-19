public class EnumAndSwitchExample {
    public enum Level{
        LOW,
        MEDIUM,
        HIGH //the third comma is optional
    }

    enum Day {
        MON, TUE, WED, THUR, FRI, SAT, SUN
    };

    public static void main(String[] args) {
        Level level = Level.MEDIUM;

        //enhanced switched introduced in java 12
        //-> can skip yield keyword, don't fall through
        //: need yield keyword
        switch(level) {
            case LOW->
                System.out.println("Low level");
            case MEDIUM-> System.out.println("Medium level");
            case HIGH -> System.out.println("High level");
        }


        System.out.println(isWeekDayV1_1(Day.MON));     //true
        System.out.println(isWeekDayV1_2(Day.MON));     //true
        System.out.println(isWeekDayV2(Day.MON));       //true
    }

    public static Boolean isWeekDayV1_1 (Day day)
    {
        Boolean result = switch(day) {
            case MON, TUE, WED, THUR, FRI -> true;
            case SAT, SUN -> false;
        };
        return result;
    }

    public static Boolean isWeekDayV1_2 (Day day)
    {
        Boolean result = switch(day) {
            case MON, TUE, WED, THUR, FRI : yield true;
            case SAT, SUN : yield false;
        };
        return result;
    }

    //2 - Multiple statements

    public static Boolean isWeekDayV2 (Day day)
    {
        Boolean result = switch(day) {
            case MON, TUE, WED, THUR, FRI ->
                    {
                        System.out.println("It is WeekDay");
                        yield true;
                    }
            case SAT, SUN ->
                    {
                        System.out.println("It is Weekend");
                        yield false;
                    }
        };
        return result;
    }


}
