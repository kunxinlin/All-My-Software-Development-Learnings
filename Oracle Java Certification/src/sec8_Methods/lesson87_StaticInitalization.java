package sec8_Methods;

import java.util.ArrayList;
import java.util.List;

public class lesson87_StaticInitalization {
    private static int num;
    public static final int num2;
    private static final List<String> name = new ArrayList<>();
    //for final statics
    //if not assign, can only be assigned in a static block
    //called whenever the class is used
    static {
        System.out.println("in static init");
        num = 2;
        num2 = 1;
//        num2 = 4; //already assigned, cant be reassigned
        name.add("Antimage");  //can manipulate the object because the final is assignment is the memory address of object
        name.add("Terrorblade");
    }

    static{
        //can have multiple but best practice to just have one.
    }

    public static void main(String[] args) {
        System.out.println("asdasdsad");
        System.out.println(name);
        //num = 3;
    }
}
