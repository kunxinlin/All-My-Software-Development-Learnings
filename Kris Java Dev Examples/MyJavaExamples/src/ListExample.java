import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        //clear()
        //isEmpty()
        //size()
        //removeAll(Collection<?> c) // remove all items from the passed collection
        //retainAll(Collection<?> c) // retain only the items from the passed collection

        //double-brace initialization
        List<String> fruits = new ArrayList<>(){{
            add("Apple");
            add("Banana");
            add("Cherry");
            add("Watermelon");
            add("Kiwi");
            add("Oranges");
            add("Pineapple");
            add("Strawberry");
            add("Plum");
        }};

        fruits.add(3, "NotAFruit"); //insert into a specific index

        fruits.set(3, "Lemon"); //replace the item at the index


        //add a collection
        fruits.addAll(new ArrayList<>(){{
            add("Grapes");
            add("Pear");
            add("Lime");
        }});

        //another way
        fruits.addAll(Arrays.asList("Dragon Fruit", "Passionfruit", "Honey Dew"));

        //Factory Methods, since Java 9, However the returned instance is immutable, so if it was set to a new List, can't modify it
        fruits.addAll(List.of("Durian", "Tangerine"));

        System.out.println(fruits);

        List<String> clone1 = List.copyOf(fruits); //

        //sort takes in a comparator, but if you pass in null it'll sort by the default comparator for which in this case String comparator.
        //fruits.sort(null); //can also do fruits.sort(String::compareTo)

        //can use the Collections.sort too
        Collections.sort(fruits);
        System.out.println(fruits);
        //Collections.sort(fruits, Collections.reverseOrder()); //can sort it in reverse order

        //Turn to an Array. toArray returns an object so need to pass in a String type array
//        String[] fruitsArr = fruits.toArray(new String[0]);
//        System.out.println(Arrays.toString(fruitsArr));

        System.out.println(fruits.subList(0,4)); //from index is inclusive, to index is exclusive
        fruits.remove(4);  //remove by index
        fruits.remove("Plum"); //remove by item
        //if wanted to remove an specific integer from a list of Integers would need to cast it to an object by
        //new Integer(1), Integer(1), Integer.valueOf(1).

        System.out.println(fruits.get(1));
        System.out.println(fruits.indexOf("Apple1")); //returns -1 if not found
        //lastIndexOf()
        //contains() ->return boolean

        //same as Iterator, except it's bidrectional and has more methods
        ListIterator listIter = fruits.listIterator();
        System.out.println(listIter.next());
        System.out.println(listIter.previousIndex());

        fruits.replaceAll(x -> "Apple"); //takes a Unary Operator
        System.out.println(fruits);


    }
}
