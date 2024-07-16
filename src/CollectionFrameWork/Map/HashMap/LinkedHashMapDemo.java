package CollectionFrameWork.Map.HashMap;

import java.util.*;
import java.util.function.BiFunction;

public class LinkedHashMapDemo {

    /*
     linkedHashMap = linked + hashmap
     It implements hashtable
     It contains only unique values
     LinkedHashMap is non-synchronized
     It allows only one null key, but values can have multiple null
     Initial capacity is 16 & its load factor is 0.75
     It maintains insertion order
     */
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lh = new LinkedHashMap<>();
        lh.put(1, "Sagar");
        lh.put(2, "rushi");
        lh.put(3, null);
        lh.put(null, null);
        lh.put(4, "bhushan");
        System.out.println("LinkedHashMap 1: " + lh);

        System.out.println("Size of LinkedHashMap 1: " + lh.size());

        LinkedHashMap<Integer, String> lh2 = new LinkedHashMap<>();
        lh2.put(2, "bhirade");
        lh2.put(3, "master");
        lh2.put(4, "king");
        System.out.println("LinkedHashMap 2: " + lh2);

        System.out.println("Keys and values in ascending order:");
        for (Map.Entry<Integer, String> entry : lh.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("Keys and values in descending order:");
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(lh.entrySet());
        Collections.reverse(entryList);
        for (Map.Entry<Integer, String> entry : entryList) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


        BiFunction<String, String, String> remappingFunction = new BiFunction<String, String, String>() {
            @Override
            public String apply(String oldValue, String newValue) {
                return oldValue + " " + newValue;
            }
        };

        lh.merge(2, "updated", remappingFunction);
        System.out.println("LinkedHashMap 1 after merge: " + lh);

        lh.merge(5, "Uday", remappingFunction);
        System.out.println("LinkedHashMap 1 after adding a new key with merge: " + lh);
    }
}
