package classwork.lesson13;

public class DynamicArray {
    private int[] array = new int[20];
    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            increaseArray();
            array[size++] = value;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }


    private void increaseArray() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }
}

