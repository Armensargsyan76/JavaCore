package chapters.chapter19;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        System.out.println("Исходное содержимое списочного массива values");
        for (Integer value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        System.out.println("Cyммa числовых значений " + sum);
    }
}
