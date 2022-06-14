package homework.arrayutil;

public class ArraySortMethod {
    void sortFromBigToSmall(int[] numbers) {
        int tmp;
        int j = 0;
        for (int i = 1; i < numbers.length; i++) {
            for (j = 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[j - 1]) {
                    tmp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        for (int x : numbers) {
            System.out.print(x + " ");
        }

    }

    void sortFromSmallToBig(int[] numbers) {
        int tmp;
        int j = 0;
        for (int i = 1; i < numbers.length; i++) {
            for (j = 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    tmp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        for (int x : numbers) {
            System.out.print(x + " ");
        }

    }


}
