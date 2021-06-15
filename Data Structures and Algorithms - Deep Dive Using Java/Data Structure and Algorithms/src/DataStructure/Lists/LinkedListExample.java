package DataStructure.Lists;
import DataStructure.*;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);  //addFirst add to the beginning of the list
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        //LL has no print method
        //going to use the iterator to print

        Iterator iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        //add and addLast is the same

        //remove and removeFirst  remove front of the list
        //removeLast remove end of the list

    }
}
