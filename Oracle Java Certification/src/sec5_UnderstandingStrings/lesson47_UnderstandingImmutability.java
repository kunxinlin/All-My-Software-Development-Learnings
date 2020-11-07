package sec5_UnderstandingStrings;

public class lesson47_UnderstandingImmutability {
    public static void main(String[] args) {

        //string cannot be changed, only new string is created
        //exam
        String hello = "hello";
        String hi = hello + "world";
        hi = hello;

        System.out.println(hi + hello);

        hello.toUpperCase(); //returns a new string of uppercases
        System.out.println(hello);
        hello = hello.toUpperCase(); //dereference from "hello"
        System.out.println(hello);

    }
}
