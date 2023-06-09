public class SwitchExample {
    public static void main(String[] args) {
        int day = 5;
        //day = 8;

        //switch statement will fall through execute all cases below if no break statement.
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
                break;
            default: //execute if no match case
                System.out.println("not 1-7");
        }
    }

    //yield are used when the switch statement need to produce a value.
    //yield transfers control by causing enclosing switch expression to produce a specified result.
    //whereas return, returns control to the invoking method or constructor.
    //introduced java 13
    //semi-colon is needed for these that produces a result
    public static String getWeekdayOrWeekend(int i){
        return switch (i) {
            case 1,2,3,4,5:
                yield "Weekday";
                //break; using break here would throw an error
            case 6,7:
                yield "Weekend";
            default: //execute if no match case
                System.out.println("not a valid day");
                yield null;
        };
    }
}
