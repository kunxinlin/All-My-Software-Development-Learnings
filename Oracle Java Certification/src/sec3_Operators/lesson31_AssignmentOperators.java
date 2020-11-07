package sec3_Operators;

public class lesson31_AssignmentOperators {

    public static void main(String[] args) {
//        int x = 1.0;
//        short y = 1131223213;
//        int z = 9f;
//        long t = 12321321321321123;

        int x = (int)1.0;
        short y = (short)1131223213; //will overflow
        int z = 9;
        long t = 12321321321321123L;

        System.out.println("y= " + y);
        System.out.println("t= " + t);

        //underflow and overflow with byte

        byte byte1 = 127;
        byte byte2 = -128;

        System.out.println("overflow: " + byte1 + "+1 = " + ++byte1);
        System.out.println("underflow: " + byte2 + "-1 = " + --byte2);

        short a = 10;
        short b = 20;
//        short c = a+b;// short is auto coverted to int
        short c = (short)(a+b);
    }
}
