package sec4_BasicControlFlow;

public class lesson39_IfElse {
    public static void main(String[] args) {

        int hoursOfDay = 12;
        if (hoursOfDay < 11) System.out.println("Morning"); //don't need brackets if single lined
        else if (hoursOfDay < 17) System.out.println("Evening");
        else System.out.println("Day");

    }
}
