import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(35);
        arrayList.add(5);
        arrayList.add(3);

        System.out.println("arrayList: " + arrayList);
        System.out.println("SingleValue: " + arrayList.get(1));

        List<Integer> linkedList = new LinkedList<>();
        Deque<Integer> dequeLinkedList = new LinkedList<>();
        LinkedList<Integer> trueLinkedList = new LinkedList<>();

        filter(arrayList);
        System.out.println(arrayList);
    }

    //only to show off .next and .remove functions
    // don't need i++ because .next and .remove take care of that
    static void filter(Collection<Integer> c) {
        for (Iterator<Integer> it = c.iterator(); it.hasNext();) {
            if (it.next() > 3)
                it.remove();
        }
    }
}