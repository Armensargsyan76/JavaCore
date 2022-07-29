package chapters.chapter19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        System.out.println("Исходное содержимое списочного массива al");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        ListIterator<String> lst = al.listIterator();
        while (lst.hasNext()) {
            String element = lst.next();
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Измeнeнный в обратном порядке список: ");
        while (lst.hasPrevious()) {
            String element = lst.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
