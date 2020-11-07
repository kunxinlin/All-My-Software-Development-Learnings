package sec7_ArrayList;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lesson69_ArrayListMethods {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList<Object> list2 = new ArrayList<Object>(); //these two are the same and Object on the right side is unnecessary

        List<String> fruits = new ArrayList<>(){{
            add("apple");
            add("pear");
            add("grape");
            add("oranges");
            add("lemons");
            add("apple");
            remove("apple"); //remove first found
            set(0, "pineapple");
        }};  //double brackets for initializing list

        fruits.remove(3);
        System.out.println(fruits);

        //clear(), contain()
        //equal() - has to be same objects same order

        //list will autobox and auto unbox
        List<Integer> num = new ArrayList<>();
        num.add(null);
        System.out.println(num);
//        int temp = num.get(0); //throws error

        num.clear();
        num.add(1);
        num.add(2);
        num.add(3);

        num.remove(1); //remove at index
        System.out.println(num);

        num.remove(new Integer(1)); //remove the Integer of value 1, deprecated
        num.remove(Integer.valueOf(3)); //same as above
        System.out.println(num);
    }
}
