import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("apple");
        fruits.add("pineapple");
        fruits.add("watermelon");

        System.out.println(fruits); //default

        fruits.add(1, "orange"); //insert
        printList(fruits);

        addInOrder(fruits, "orange");
        addInOrder(fruits, "cherry");
        addInOrder(fruits, "banana");
        addInOrder(fruits, "grape");
        addInOrder(fruits, "lemon");
        addInOrder(fruits, "lime");
        addInOrder(fruits, "dragon fruit");
        addInOrder(fruits, "pear");
        addInOrder(fruits, "strawberry");
        addInOrder(fruits, "honeydew");

        printList(fruits);

    }

    static void printList(LinkedList<String> list){
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next()); //next() returns the current node and move to the next node.
        }
    }

    static void addInOrder(LinkedList<String> list, String s){
        ListIterator<String> iter = list.listIterator();

        while(iter.hasNext()){
            int compare = iter.next().compareTo(s);
            if(compare == 0){
                System.out.println(s + " already exist");
                System.out.println("=============");
                return;
            }else if(compare > 0){ //the item in current node is greater, so we need to go back one and add it to the previous node
                iter.previous();
                iter.add(s);
                return;
            }else{
                //move on to the next node
            }
        }
    }

}
