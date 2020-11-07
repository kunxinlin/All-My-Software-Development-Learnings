package sec2_JavaBasics;

public class lesson23_PrimitiveWrapperTypesAndBoxing {
    public static void main(String[] args) {

        Integer integer = new Integer(10); //this is boxing, redundant since it autobox like below// ↓↓
        Integer integer2 = 20; //declaring Integer object but setting value as primitive;
        Integer integerNull = null; //works since its a object

        //boxing is when you put primitive inside the Wrapper. unboxing is the opposite

        int unbox = integer; //unboxing

        int temp = 5;
        integer2 = temp; //also boxing

//        temp = integerNull //will throw NullPointerException

        System.out.println(integer2);
        sum(1,2); //also autobox
    }

    static void sum(Integer n1, Integer n2){
        System.out.println(n1+n2);
    }
}
