package sec7_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class lesson75_ListIteration {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(){{
            add(2);
            add(5);
            add(7);
            add(8);
            add(9);
        }};

        List<Integer> temp = new ArrayList<>(nums);

//        for (int i = 0; i < nums.size(); i++){
//            System.out.println(nums.get(i));
//            nums.remove(0); //basically you can't do remove using it normally like you think
//        }



        for (int i = 0, j = nums.size(); i < j; i++) {
            System.out.println(nums.get(0));
            nums.remove(0);
        }

        System.out.println(nums);
        System.out.println();

        List<Integer> nums2 = new ArrayList<>(temp);


        for (var i: nums2) {
//            System.out.println(i);
//            nums2.remove(0); //can't modify list that we are iterating through -> ConcurrentModificationException
        }

        Iterator<Integer> iter = nums2.iterator();
//        iter.remove(); //IllegalStateException
        //same as while(iter.hasNext()) loop
        for(;iter.hasNext();){
            Integer i = iter.next();
            System.out.println(i);
            iter.remove(); //removes the last returned element in iter, so it has to used with iter.next()
        }

        System.out.println(nums2 + "\n");

        nums.addAll(temp);
        //only works with List, more methods
//        ListIterator<Integer> listIter = nums.listIterator(4); //iter starting from index
        ListIterator<Integer> listIter = nums.listIterator(4); //iter starting from index

        //iter from backwards
        while(listIter.hasPrevious()){
            int temp2 = listIter.previous();
            System.out.println("index " + nums.indexOf(temp2) + ": "  + temp2);
        }
    }
}

/*
* for - best for if need index
* foreach - best for if just need to simply iterate through
* iterator - best for need to remove element at the same time
* listIterator - go backwards, and start from certain index
* */