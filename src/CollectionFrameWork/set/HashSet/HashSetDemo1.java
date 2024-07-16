package CollectionFrameWork.set.HashSet;

import java.util.*;

public class HashSetDemo1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashSet<Object> hs = new HashSet<>();
        hs.add(112);
        hs.add("Sandip");
        hs.add(10);
        hs.add(null);
        hs.add("Sagar");
        hs.add(112);
        System.out.println(hs);
        System.out.println(hs.remove(112));
        System.out.println(hs);

        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(63);
        hs2.add(67);
        hs2.add(47);
        hs2.add(97);
        hs2.add(69);
        System.out.println(Collections.synchronizedSet(hs2));

        Iterator itr = hs2.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        
        if(!search(hs2)){
            System.out.println("Element is not found");
        }else{
            System.out.println("element is found");
        }
    }
    private static boolean search(HashSet<Integer> hs2){
        for (int i = 0; i < hs2.size(); i++) {
            if(hs2.contains(14)){
                return true;
            }
        }
        return false;
    }
}
