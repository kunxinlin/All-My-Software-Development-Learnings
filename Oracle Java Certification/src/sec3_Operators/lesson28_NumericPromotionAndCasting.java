package sec3_Operators;

public class lesson28_NumericPromotionAndCasting {
    public static void main(String[] args) {
        //smaller data will be auto promoted to larger
        //ex. float + double, the float will become double

        //small data types (byte, short, and char) will be auto promoted to int when used with binary arithmetic operators

        int x = 5;
        double y = 10.55;

        System.out.println("x + sadasd = " + x + y); //treats x and y like a string so 10.55 get concatenated to 5
        System.out.println("x + y = " + (x+y));

        int downcast = (int)5.95; //loses the precision, basically any after the decimal is gone
        System.out.println("downcast: " + downcast);

        byte byteResult = (byte) (125+15); //overflow since byte is -128 to 127
        System.out.println("byteResult= " + byteResult);

        short s1 = 14;
        short s2 = 6;
        System.out.println(s1/s2);//we get an int
        System.out.println(((double)s1/s2));
    }
}


/*
What is the data type of x + y
* double x = 44.25
* float y = 3.35
* ans: doesn't compile
*/

/*
What is the data type of x / y
* short x = 14
* short y = 6
* ans: x and y will be promoted to int.
*/