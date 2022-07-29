package chapters.chapter14;

import sun.misc.Queue;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.DelayQueue;

public class HierDemo {
    public static void main(String[] args) {

        Gen1<Integer> iOb = new Gen1<>(88);
        Gen2<Integer> iOb2 = new Gen2<>(99);
        Gen2<String> strOb2 = new Gen2<>("Tecт обобщений");

        if (iOb2 instanceof Gen2<?>) {
            System.out.println("Oбъeкт iOb2 является экземпляром класса Gen2");
        }
        if (iOb2 instanceof Gen1<?>) {
            System.out.println("Oбъeкт iOb2 является экземпляром класса Gen1");
        }
        if (strOb2 instanceof Gen2<?>) {
            System.out.println("Oбъeкт strOb2 является экземпляром класса Gen2");
        }
        if (iOb instanceof Gen2<?>){

        }



    }
}
