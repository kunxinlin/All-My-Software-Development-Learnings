package SortAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
            //item we are inserting
            int newElement = intArray[firstUnsortedIndex];

            //need i after the loop
            int i;

            //keep shifting as long as i is > 0, because it is 0, then it means its in the very front which is then sorted
            //and the item before this element is still greater
            for(i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--){
                //shift the index the right of the sorted partition
                intArray[i] = intArray[i-1];
            }

            //place the to be inserted element at the position the loop dropped off at
            intArray[i] = newElement;
        }

        for(int i = 0;  i< intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");
        }
    }
}
