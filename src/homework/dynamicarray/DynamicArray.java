package homework.dynamicarray;

public class DynamicArray {
    private int[] array = new int[10];
    private int size;

    public void add(int value) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = value;
    }

    private void increaseArray() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getByIndex(int index) {
        return array[index];
    }

    public int getFirstIndexByValue(int value) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void set(int index, int value) {
        array[index] = value;
    }

    public void add(int index, int value) {
        if (index >= 0 && index < array.length) {
            for (int i = size; i <= index; i--) {
                if (size == array.length) {
                    increaseArray();
                }
                array[i] = array[i - 1];
            }
            array[index] = value;
            size++;
        }

    }

    public void delete(int index) {
        if (index >= 0 && index < array.length) {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }

    }
}
