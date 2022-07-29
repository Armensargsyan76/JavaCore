package classwork.lesson27;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("poxos");
        arrayList.add("poxos");

        for (String s : arrayList) {
            System.out.println(s);
        }
//        print(arrayList);
//        List<String> linkList = new LinkedList<>();
//        print(linkList);

    }

    public static void print(List<?> items) {
        for (Object item : items) {
            System.out.println(item);
        }
    }
}
