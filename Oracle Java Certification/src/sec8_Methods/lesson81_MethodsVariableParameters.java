package sec8_Methods;

import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

public class lesson81_MethodsVariableParameters {
    public void test1 (int... num){} //can past in array or list or even empty argument, java will auto create an array
    public void test2 (int i, int... num){}
//    public void test3 (int... num, int i){} //vararg must be at the end
//    public void test4 (int... num, int... num2){} //and only one is allowed

    public static void main(String[] args) {
        print(1,2,3);
        print();
//        print(null); //will throw nullpointerexception


    }

    public static void print (int... num){
        System.out.print("output: ");
        for (var i : num){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
