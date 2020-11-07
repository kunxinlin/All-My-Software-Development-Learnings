package sec7_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lesson72_ArrayListAndArrayConversion {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(){{
            add("apple");
            add("pear");
            add("grape");
            add("oranges");
            add("lemons");
        }};

        String[] temp = fruits.toArray(new String[0]); //more memory intensive
        String[] temp1 = fruits.toArray(new String[fruits.size()]); //proper way

        System.out.println(Arrays.toString(temp1));

        List<String> f2 = Arrays.asList(temp1); //these two becomes linked, and List becomes fixed sized list
//        f2.remove(4); //cant do this since f2 is fixed size
        //same with add();

        System.out.println(f2);

        System.out.println();

        f2.set(0, "pinepple");
        System.out.println(Arrays.toString(temp1));
        System.out.println(f2);

        System.out.println();

        temp1[4] = "limes";
        System.out.println(Arrays.toString(temp1));
        System.out.println(f2);
        System.out.println();

        List<String> f3 = new ArrayList<>(Arrays.asList(temp1));//proper way, this won't be linked, and you can make full use of arraylist
        temp1[2] = "strawberry";
        f3.add("rasberry");

        System.out.println(Arrays.toString(temp1));
        System.out.println(f3);

        Collections.sort(f3);
        System.out.println(f3);
        System.out.println(Collections.binarySearch(f3, "sun"));
    }
}
