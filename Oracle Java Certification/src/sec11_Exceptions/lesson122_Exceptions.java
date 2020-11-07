package sec11_Exceptions;

/*
* All Exceptions and Errors extends from throwable
* Errors - something went horribly wrong, program shouldn't try to recover from, ex. Disk Drive Full
*
* Exceptions- can be caught or handle/declared
* Unchecked = runtime exception - ok but not required to handle
* Checked - anything that is not runtime exceptions, usually expected - required to be handled or declared in method signature
*
*
*  */
public class lesson122_Exceptions {
    public static void main(String[] args) {
//        method1(); //will have compile error since this checked exception wasn't handled
        method2(); //not required to handle since its Runtime exceptions

    }

    //saying this method might or might not throw an exception
    public static void method1() throws Exception{

    }

    public static void method2() throws RuntimeException{

    }
}
