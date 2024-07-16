package ComparatorAndComparableInterface.Comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Demo1 {
    public static void main(String[] args) {
        LinkedList<StudDetails> ll = new LinkedList<>();

        ll.add(new StudDetails(1, "Sandip", 67.0, 111111111));
        ll.add(new StudDetails(2, "Hrishi", 33.0, 222222222));
        ll.add(new StudDetails(3, "Sagar", 44.0, 333333333));
        ll.add(new StudDetails(4, "Rajesh", 55.0, 444444444));
        ll.add(new StudDetails(5, "Rahul", 24.0, 555555555));

        System.out.println("List before sorting:");
        for (StudDetails stud : ll) {
            System.out.println(stud);
        }

        Collections.sort(ll, new Comparator<StudDetails>() {
            @Override
            public int compare(StudDetails o1, StudDetails o2) {
                return o1.getRoll_no()- o2.getRoll_no();
            }
        });

        System.out.println("\nList after sorting by Roll Number:");
        for (StudDetails stud : ll) {
            System.out.println(stud);
        }


        Collections.sort(ll, new Comparator<StudDetails>() {
            @Override
            public int compare(StudDetails o1, StudDetails o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("\nList after sorting by name:");
        for (StudDetails stud : ll) {
            System.out.println(stud);
        }

    }
}
