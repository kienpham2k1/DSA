import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import OneDimensionArray.Array;

public class Interator {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }
        System.out.println("Array: " + arr.toString());
        Iterator itr = arr.iterator();
        System.out.println("Using iterator");
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println("\nUsing iterator list");
        ListIterator litr = arr.listIterator();
        while (litr.hasNext()) {
            Object e = litr.next();
            System.out.print(e + " ");
        }
        System.out.println("\nopposite traversal");
        while (litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("delete element in iterator");
        System.out.println("Delete element value: 3");
        litr = arr.listIterator();
        while (litr.hasNext()) {
            Object e = litr.next();
            if (e.toString().equals((new Integer(3).toString()))) {
                litr.remove();
                System.out.println("Delete success!");
            }
        }
        Iterator ite = arr.iterator();
        while (ite.hasNext()) {
            Object element = ite.next();
            System.out.print(element + " ");
        }
    }
}
