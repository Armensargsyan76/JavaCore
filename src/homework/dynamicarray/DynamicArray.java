package homework.dynamicarray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    boolean isEmpty() {
        return size == 0;
    }

    int getByIndex(int index) {
        return array[index];
    }

    int getFirstIndexByValue(int value) {
        int i = 0;
        for (i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return i;
    }

    void set(int index, int value) {
        array[index] = value;
    }

    void add(int index, int value) {
        if (index >= 0 && index < size) {
            for (int i = size; i >= index; i--) {
                if (size == array.length) {
                    extend();
                }
                array[i] = array[i - 1];
            }
            array[index] = value;
            size++;
        } else {
            System.out.println("Error : index out of bounds");
        }

    }

    void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                if (size == array.length) {
                    extend();
                }
                array[i] = array[i + 1];
            }
            size--;
        } else {
            System.out.println("Error : index out of bounds");
        }

    }

}

