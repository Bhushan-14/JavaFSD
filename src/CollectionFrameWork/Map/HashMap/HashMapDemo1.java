package CollectionFrameWork.Map.HashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;


public class HashMapDemo1 {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();
        m.put(101,"Umesh");
        m.put(102,"Tushar");
        m.put(103,"Krisha");
        m.put(104,"Umesh");
        m.put(105,"Sandip");
        m.put(103,"Sandip");
        m.put(null,"sandip");
        m.put(205, null);
        System.out.println(m);
        System.out.println(m.remove(201,"sandip"));
        m.replace(null, null);
        m.replace(105,"Sandip","chetan");

        System.out.println(m);
        Iterator itr = m.values().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for(Map.Entry<Integer,String> mp:m.entrySet()){
            System.out.println(mp.getKey()+" : "+mp.getValue());
        }
    }
}