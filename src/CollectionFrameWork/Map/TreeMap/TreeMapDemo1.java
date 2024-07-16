package CollectionFrameWork.Map.TreeMap;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        tm.put(6,34);
        tm.put(9,23);
        tm.put(1,10);
        tm.put(2,11);
        tm.put(8,14);
        tm.put(3,10);
        tm.put(5,null);
//        tm.put(null,14);
//        tm.put(null,null);
        tm.put(4,12);
        System.out.println(tm);

        System.out.println(tm.entrySet());
        for (Map.Entry<Integer, Integer> entry : tm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        Iterator<Map.Entry<Integer, Integer>> itr = tm.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, Integer> entry = itr.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println(tm.keySet());
        System.out.println(tm.values());

        System.out.println(tm.ceilingEntry(3));
        System.out.println(tm.ceilingKey(1));

        System.out.println(tm.floorEntry(3));
        System.out.println(tm.floorKey(1));

        System.out.println(tm.firstEntry());
        System.out.println(tm.lastEntry());


        System.out.println(tm.higherEntry(4));
        System.out.println(tm.lowerEntry(2));

        System.out.println(tm.pollFirstEntry());
        System.out.println(tm.pollLastEntry());

        System.out.println(tm.descendingMap());
        System.out.println(tm.descendingKeySet());

        System.out.println(tm.tailMap(4));
        System.out.println(tm.subMap(3,8));

        System.out.println(Collections.synchronizedMap(tm));
    }
}

