package homework.arrayutil;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    max = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = max;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        int min = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    min = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = min;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
