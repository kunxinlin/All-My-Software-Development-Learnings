package SortAlgorithms;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //Arrays.sort(intArray);
        Arrays.parallelSort(intArray); //might be faster with larger data set, also uses threads

        for(int i = 0;  i< intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");
        }
    }
}
