package sec3_Operators;

import java.util.function.DoubleToIntFunction;

//difference between == and equals()
public class lesson36_UnderstandingDifferentEquals {
    public static void main(String[] args) {
        //objects are compared using equals()
        //== is used for primitives
        //when == is used on an object, it compares object reference (memory locations)

        /*
        valueOf is automatically called for 127 (autobox), valueOf caches numbers -128 to 127 that is passed into it,
        uses the stored cache value if same number is used again -128 to 127
        */
        Integer int1 = 127;
        Integer int2 = 127;

        System.out.println(int1 == int2); //true
        System.out.println(int1.equals(int2)); //true

        int1 = 126;
        int2 = 126;
        Integer int3 = new Integer(126); //forcing a new memory location, that's why its @Deprecated (discouraged), just wasting memory and pointless

        System.out.println(int1 == int2); //true
        System.out.println(int1 == int3); //false

        System.out.println(System.identityHashCode(int1));
        System.out.println(System.identityHashCode(int2));
        System.out.println(System.identityHashCode(int3));

        //if its outside of -128 to 127 it returns a new Instance every time  it's not in the cache so therefore
        //the memory address is different for the 2 128, they are in two different memory location vs the 127 that is in the same cache
        int1 = 128;
        int2 = 128;

        System.out.println(int1 == int2); //false
        System.out.println(System.identityHashCode(int1));
        System.out.println(System.identityHashCode(int2));

    }
}
