package sec4_BasicControlFlow;


import org.w3c.dom.ls.LSOutput;

public class lesson41_SwitchStatement {
    public static void main(String[] args) {
        //byte, short, char, int and their wrappers, String, and ENUMS

        int day = 1;

        //switch continues to execute until it hits first break
        switch (day){
            case 1:
            case 2:
            case 3:
                System.out.println("1-3");
            case 4:
                System.out.println("4");
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("not 1-5");
                break; //optional since default is last, but default could be first case
        }


    }
}
