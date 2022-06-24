package homework.arrayutil;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        ArraySortMethod sort = new ArraySortMethod();
        int[] ints = sort.sortMaxMin(numbers);
        for (int i : ints) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] ints1 = sort.sortMinMax(numbers);
        for (int i : ints1) {
            System.out.print(i + " ");
        }
    }
}
