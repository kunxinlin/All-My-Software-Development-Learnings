import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        //clear()
        //containsKey()
        //containsValue()
        //entrySet()
        //get()
        //getOrDefault()
        //isEmpty()
        //put()
        //putAll()
        //keySet()
        //values()
        //remove(Object key), remove(Object key, Object value) - remove only if currently mapped to specified value
        //replace(key, value), replace(key, oldValue, value) - replace only if currently mapped to oldValue
        //size()

        //HashMap - unordered, LinkedHashMap - insertion order, TreeMap - alphanumeric order
        Map<String, Integer> fruitCount = new HashMap<>();
        fruitCount.put("Apple", 10);
        fruitCount.put("Banana", 6);
        fruitCount.put("Oranges", 7);
        fruitCount.put("Grapes", 25);
        fruitCount.put("Kiwi", 15);

        System.out.println(fruitCount);
        System.out.println(fruitCount.keySet());
        System.out.println(fruitCount.values());

        for(Map.Entry<String, Integer> entry : fruitCount.entrySet()){
            System.out.printf("%d %s%n", entry.getValue(), entry.getKey());
        }

        System.out.println(fruitCount.get("Apple1"));
        System.out.println(fruitCount.getOrDefault("Apple1", 0));



    }
}
