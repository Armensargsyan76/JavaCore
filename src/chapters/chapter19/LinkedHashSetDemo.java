package chapters.chapter19;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<String> lh = new LinkedHashSet<>();
        lh.add("Бета");
        lh.add("Альфа");
        lh.add("Эта");
        lh.add("Гамма");
        lh.add("Эпсилон");
        lh.add("Омега");
        System.out.println(lh);
    }
}
