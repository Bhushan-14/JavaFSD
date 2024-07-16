package CollectionFrameWork.set.HashSet;

import java.util.HashSet;

public class CommonOfThreeArray {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(23);
        hs1.add(20);
        hs1.add(21);
        hs1.add(22);
        hs1.add(22);
        hs1.add(18);
        hs1.add(23);
        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(23);
        hs2.add(24);
        hs2.add(23);
        hs2.add(22);
        hs2.add(21);
        hs2.add(29);
        HashSet<Integer> hs3 = new HashSet<>();
        hs3.add(18);
        hs3.add(13);
        hs3.add(23);
        hs3.add(43);
        hs3.add(22);
        hs3.add(21);
        hs1.retainAll(hs2);
        hs1.retainAll(hs3);
        System.out.println(hs1);

    }
}
