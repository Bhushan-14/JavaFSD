package CollectionFrameWork.Map.TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
//
//public class WeakHashMapDemo {
//    public static void main(String[] args) {
//        WeakHashMap<Integer, String> map = new WeakHashMap<>();
//        map.put(1, "Sagar");
//        map.put(9, "Uday");
//        map.put(8, "Riddhesh");
//        map.put(6, "Shubham");
////        map.put(null, null);
//        map.put(2, "Hrishi");
//        map.put(3, "Sandip");
//        map.put(null, "Rahul");
//        map.put(null, "Majnu");
//        map.put(4, null);
//
//
//        System.out.println(map);
//
//        Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();
//        while (itr.hasNext()) {
//            Map.Entry<Integer, String> entry = itr.next();
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }
//        System.out.println(map.keySet());
//        map.put(11, null);
//        System.out.println(map);
//        System.gc();
//        System.out.println(map);
//    }
//}

import java.util.*;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<Integer, String> map = new WeakHashMap<>();
        Integer key1 = new Integer(1);
        map.put(key1, "Value1");

        Integer key2 = new Integer(2);
        map.put(key2, "Value2");

        System.out.println("Before GC: " + map);

        key1 = null;
        key2 = null;

        System.gc();

        System.out.println("After GC: " + map);
    }
}

