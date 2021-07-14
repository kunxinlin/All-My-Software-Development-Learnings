import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        //add()
        //addAll() - union of 2 sets
        //clear()
        //contains()
        //isEmpty()
        //iterator()
        //remove()
        //retainAll() - will get the intersection
        //removeAll() - remove all items that shows up in the collection that's passed in
        //size()
        //toArray() can pass in T[] to specify the type of array returned
        Set<String> frontend = new HashSet<>(Arrays.asList("CSS", "HTML", "JavaScript"));
        Set<String> backend = new HashSet<>(Arrays.asList("C++", "Java", "JavaScript", "Python"));

        List<String> list = List.of("NodeJS", "Bootstrap", "Spring");
        Set<String> union = new HashSet<>(frontend);
        union.addAll(list); //will get the union of the two

        Set<String> intersection = new HashSet<>(frontend);
        intersection.retainAll(backend);

        System.out.println(union);
        System.out.println(intersection);

        //use TreeSet if want set to be sorted
        Set<String> sortedSet = new TreeSet<>(){{
            add("HTML");
            add("Python");
            add("C++");
            add("CSS");
            add("Java");
            add("Ruby");
            add("Golang");
        }};

        for(var x : sortedSet){
            System.out.println(x);
        }
    }
}
