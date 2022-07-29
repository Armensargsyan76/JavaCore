package chapters.chapter19;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> ob = new ArrayList<>();
        System.out.println("Haчaльный размер списочного " + ob.size());
        ob.add("a");
        ob.add("b");
        ob.add("c");
        ob.add("e");
        ob.add(1, "k");
        System.out.println("Paзмep списочного массива после ввода элементов " + ob.size());
        System.out.println("Coдepжимoe списочного массива ob " + ob);
        ob.remove("b");
        ob.remove(3);
        System.out.println("Paзмep списочного массива ob после удаления элементов " + ob.size());
        System.out.println("Coдepжимoe списочного массива ob " + ob);

    }
}
