package sec4_BasicControlFlow;

import org.w3c.dom.ls.LSOutput;

//shorthand for simple if else statement
public class lesson40_TernaryOperator {
    public static void main(String[] args) {
        int x = 10;
        int y;

        //assignment using ternary
        y = (x > 5) ? (2 * x) : (x * 4); //( ) is just for readability
        System.out.println(y);

        System.out.println(((x > 5) ? "if" : "else"));
        System.out.println(((x < 5) ? "if" : "else"));

        int d = 1;
        int e = 2;
        int f = 3;

        if (d<10) f = d++ < 1 ? e++ : f++;
        else f = (d + e) < 2 ? d++ : e++;

        System.out.println("d=" + d + " e=" + e + " f="  +f);

        //can have multiple ternary, internal gets executed first
        x = 5;
        System.out.println(x > 2 ? x <4 ? 10: 8: 7);
    }
}
