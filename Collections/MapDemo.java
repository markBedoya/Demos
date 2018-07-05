import java.util.*;
import java.util.Map.Entry;

public class MapDemo {
    public static void main(String[] args) {
        //Map don't have iterators!
        //get are key to value pairs
        // no 0 position like array unless one is made
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Thanos");
        hashMap.put(2, "Iron Man");
        hashMap.put(3, "Dr. Strange");
        hashMap.put(4, "I don't feel so good");

        System.out.println(hashMap);
        System.out.println(hashMap.get(2));

        //Using entry
        // this basically converts hashmap into a set?
        for (Entry<Integer, String> e : hashMap.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        //Using key set
        Set<Integer> keys = hashMap.keySet();
        for (Integer k : keys) {
            System.out.println(k + ": " + hashMap.get(k));
        }
    }
}