package CollectionFrameWork.Map.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lh1 = new LinkedHashMap<>();
        lh1.put(1, "Sagar");
        lh1.put(2, "Hrishi");
        lh1.put(3, null);
//        lh1.put(null, null);
        lh1.put(4, "Sandip");
        System.out.println("LinkedHashMap 1: " + lh1);

        LinkedHashMap<Integer, String> lh2 = new LinkedHashMap<>();
        lh2.put(1, "Birhade");
        lh2.put(2, "Deshmukh");
        lh2.put(3, "king");
        lh2.put(4, "Uday");
        System.out.println("LinkedHashMap 2: " + lh2);

        for (Map.Entry<Integer, String> entry : lh2.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (lh1.containsKey(key)) {
                String oldValue = lh1.get(key);
                if (oldValue == null) {
                    lh1.put(key, value);
                } else if (value != null) {
                    lh1.put(key, oldValue + " " + value);
                }
            } else {
                lh1.put(key, value);
            }
        }

        System.out.println("Merged LinkedHashMap: " + lh1);
    }
}
