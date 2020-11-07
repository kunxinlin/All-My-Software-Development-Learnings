package sec6_Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class lesson63_BinarySeach {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 7, 11};

        System.out.println(Arrays.binarySearch(numbers, 2)); //return the index of where it would be in negative if it doesn't exist

        int[]  numbers2 = {1, 12, 3, 5, 20, 10, 6, 7, 11};
        System.out.println(Arrays.binarySearch(numbers2, 3)); //unpredictable result, needs to be sorted
        System.out.println(Arrays.binarySearch(numbers2, 20));




    }
}
