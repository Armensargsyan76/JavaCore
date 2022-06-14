package classwork.lesson13;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dynArray = new DynamicArray();

        for (int i = 0; i < 25; i++) {
            dynArray.add(i);
        }
        dynArray.print();
    }

}
