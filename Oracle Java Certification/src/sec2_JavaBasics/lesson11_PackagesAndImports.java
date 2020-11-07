package sec2_JavaBasics;

import java.util.*; //* imports everything (aka Wildcard import)
import java.util.Random; //redundant since it's included above

public class lesson11_PackagesAndImports {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(100)); //we can use System class since its part of java.lang which is automatically imported
    }
}