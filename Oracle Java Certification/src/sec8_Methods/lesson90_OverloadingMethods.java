package sec8_Methods;

public class lesson90_OverloadingMethods {

    //when using overloaded methods, goes by this order ↓↓↓
    //exact match by type ex. int
    //larger primitive ex. long
    //autoboxed type ex. Integer
    //varargs ex. int...

    public void walk(int[] num){}
//    public static void walk(int... nums){} //varags is treated similarly to arrays

    public static void main(String[] args) {
        walk(9); //gets promoted
    }

    public static void walk (double n){}
    public static void walk (Integer integer){}

}
