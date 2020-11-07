package sec3_Operators;

import org.w3c.dom.ls.LSOutput;

public class lesson29_UnaryOperators {

    public static void main(String[] args) {
        //Unary Operators are +, -, ++, --, !
        //+ indicates a number is positive, redundant
        int num = +3;

        //- indicate a negative or negate a number
        int num2 = 3;
        int num3 = -num2;
        System.out.println(num3); //-3

        //increment and decrement has higher order than other operators

        //exam question
        int x = 3;
        int y = ++x * 5/ x-- + --x;
        System.out.println("x = " + x + ", y = " + y);
    }
}
