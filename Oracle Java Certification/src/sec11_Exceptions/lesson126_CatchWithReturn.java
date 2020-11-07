package sec11_Exceptions;

public class lesson126_CatchWithReturn {
    public static void main(String[] args) {
        System.out.println(calculate());
    }

    public static int calculate(){
        try{
            return 10/0;
        } catch (ArithmeticException ae){
            System.out.println("in catch");
            System.exit(0); //this terminates the JVM, only case where finally is not called
            return 1;
        } finally { //finally is called even after return because it suppresses returns until after the finally
            System.out.println("in finally");
//            return 0; //returns 0
        }
    }
}
