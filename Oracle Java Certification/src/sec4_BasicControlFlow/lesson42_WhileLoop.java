package sec4_BasicControlFlow;

public class lesson42_WhileLoop {
    public static void main(String[] args) {

//        while(false){
//            System.out.println("asd"); //throws error not using a variable for false
//        }

//        int x = 0;
//
//        while(true){
//            System.out.println(x++);  //never ending loop, rest of statement under is unreachable, compile error
//        }

        boolean b = false;
        while(b){
            System.out.println("asd");
        }

        System.out.println("after while loop");
    }
}
