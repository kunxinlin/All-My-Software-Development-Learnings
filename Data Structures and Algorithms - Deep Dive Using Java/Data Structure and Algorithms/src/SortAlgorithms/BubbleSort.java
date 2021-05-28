package SortAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //sorted from right to left
        //repeat for N numbers of elements
        for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--)
        {
            for(int i = 0; i < lastUnsortedIndex; i++)
            {
                if(intArray[i] > intArray[i+1])
                {
                    swap(intArray, i, i+1);
                }
            }
        }

        for(int i = 0;  i< intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");
        }
    }

    //i and j is the indices we want to swap
    public static void swap(int[] array, int i, int j)
    {
        //not really necessary tbh.
        if ( i == j) { //nothing to swap
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
