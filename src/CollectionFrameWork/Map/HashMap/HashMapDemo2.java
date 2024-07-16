package CollectionFrameWork.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo2{
    public static void main(String[] args) {
        HashMap<Character,String> hs = new HashMap<Character,String>();
        hs.put('A',"Sandip");
        hs.put('B',"Rahul");
        hs.put('C',"Sagar");
        hs.put('D',"Hrishi");
        hs.put('E',"Riddhesh");

        for (Map.Entry<Character,String> map: hs.entrySet()) {
            System.out.println(map.getKey()+" "+map.getValue());
        }

        
        Iterator<Map.Entry<Character, String>> itr = hs.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Character, String> entry = itr.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
