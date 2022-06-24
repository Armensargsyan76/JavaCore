package homework.arrayutil;

public class ArraySortMethod {
    int[] sortMaxMin(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    max = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = max;
                }
            }
        }
        return array;
    }

    int[] sortMinMax(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    min = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = min;
                }
            }
        }
        return array;
    }


}
