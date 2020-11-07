package sec11_Exceptions;

public class lesson124_HandlingExceptions {
    public static void main(String[] args) {

        try{
//            int temp = 10/0; //will not print tryyyyy
            System.out.println("Tryyyyy");
        } /*catch(Exception e){
            //this will throw compile error since Exception is the parent of Arithmetic so it will catch Arithmetic too
        } */catch(ArithmeticException e){
            System.out.println("Catchhhh");
        } catch(Exception e){
            //more general, if you want to catch more specific exception, have it before this.
        } finally { //finally block is always executed, if there was an exception caught or not
            System.out.println("Finallyyy");
        }
    }
}
