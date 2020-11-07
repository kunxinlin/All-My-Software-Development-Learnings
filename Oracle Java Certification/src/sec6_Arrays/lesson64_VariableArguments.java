package sec6_Arrays;

import java.util.Arrays;

public class lesson64_VariableArguments {

//    public static void main(String[] args) {
//        System.out.println(args.length);
//        System.out.println(Arrays.toString(args));
//    }

    //... is a variable argument, legal for main
    public static void main(String... args) {
        System.out.println(args.length);

        print(args);
        print("Java");
        print("this", "is", "my", "string", "array"); //just for making it easier to pass in value without need to create new
        print2(new String[] {"variable", "arguments", "are", "nice", "and", "useful", "feature"});
    }

    private static void print(String... myArguments) {
        System.out.println(Arrays.toString(myArguments));
    }

    private static void print2(String[] strings){
        System.out.println(Arrays.toString(strings));
    }
}
