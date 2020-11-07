package sec6_Arrays;

import java.util.Arrays;

public class lesson56_UnderstandingArrays {
    public static void main(String[] args) {
        int[] one = new int[3];
        int[] two = new int[]{1, 2 , 3};
        int[] three = {1, 2, 3}; //this is called anonymous array, no type declaration on the right side

        double[]  a = new double[4*5/3]; //legal

        int[] n1 = {}; //empty array
        int[] n2; //not init will throw error if try to use
        int n3[]; //array can be written like this too

        int[] x, y;
        int x2[], y2; //create an array and a int, bad practice

        String[] animals = {"Dog", "Cat", "Cow"};
        String[] animals2 = animals;
        String[] animals3 = {"Dog", "Cat", "Cow"};

        System.out.println(animals.equals(animals3)); //.equals checks for the reference of the array same as ==
        System.out.println(animals == animals2); //same as .equals

        System.out.println(Arrays.equals(animals, animals3)); //to check if the content is the same

        System.out.println(animals); //prints memory address
        System.out.println(Arrays.toString(animals));
    }
}
