package sec3_Operators;

public class lesson34_ConditionalOperators {
    public static void main(String[] args) {
        //&& and
        //|| or

        //^ XOR - true if the two is different
        //true true -> false, false false -> false, true false -> true

        boolean a = true;
        boolean b = false;

        boolean c = false && (5>4); //(5>4)is never evaluated (short-circuiting)

        boolean d = false || false &&  true; //false
        System.out.println(d);


        //exam questions
        int int1 = 3;
        int int2 = 4;

        boolean bool = (int1 <= 3) && (int2-- ==4) || (int1++ == 4);
        //true && true || ,
        // but since true short circuits the || the rest of the expression is not executed so int1 stays 3

        System.out.println("int1= " + int1);
        System.out.println("int2= " + int2);
        System.out.println(bool);
    }
}
