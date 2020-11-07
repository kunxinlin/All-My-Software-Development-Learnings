package sec2_JavaBasics;

//below is a Javadoc comment, they start with /**
/**
 * This is a Javadoc comment
 */
public class lesson10_Comments {

    /**
     * This is main method
     * @param args command line arguments
     *             can pass arguments from the command line after typing the java class file
     *             can do it in Intellij in edit configuration(left of the run button top right) //I passed in "Hello World"
     */
    public static void main(String[] args) {
        for(String i : args){
            System.out.println(i);
        }

        sum(1,1); //ctrl+q to see documentation or hover over
    }

    /**
     * Sums two method
     * @param a operand
     * @param b operand
     * @return int
     */
    public static int sum(int a, int b){
        return a+b;
    }
}
