package homework.dynamicarray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dynArray = new DynamicArray();

        dynArray.add(5);
        dynArray.add(6);
        dynArray.add(8);
        dynArray.add(7);
        System.out.println(dynArray.isEmpty());
        System.out.println(dynArray.getByIndex(1));
        System.out.println(dynArray.getFirstIndexByValue(8));
        dynArray.set(2, 4);
        dynArray.print();
        dynArray.delete(0);
        dynArray.print();
    }

}
