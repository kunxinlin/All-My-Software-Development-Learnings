package DataStructure.Hashtables;
import DataStructure.*;
import java.util.*;


public class HashMapExample {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        Map<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);
        //DataStructure.Employee employee = hashMap.put("Doe", mikeWilson);  //will replace johnDoe and return the value that was there before.
        Employee employee = hashMap.putIfAbsent("Doe", mikeWilson); //put if no key
        System.out.println(employee);

        System.out.println(hashMap.getOrDefault("someone", mikeWilson)); //getOrDefault, return a specified default value if null

        System.out.println(hashMap.remove("Jones"));

//        System.out.println(hashMap.containsKey("Doe"));
//        System.out.println(hashMap.containsValue(janeJones));

//        Iterator<DataStructure.Employee> iterator = hashMap.values().iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        hashMap.forEach((k, v) -> System.out.println("Key = " + k + ", DataStructure.Employee = " + v));
    }
}
