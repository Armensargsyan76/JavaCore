package homework.arrayutil;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        int tmp = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        int[] numbers1 = {43, 55, 5, -9, 0, 12, 5, 65};
        int num = 0;
        for (int i = 0; i < numbers1.length - 1; i++) {
            for (int j = 0; j < numbers1.length - 1; j++) {
                if (numbers1[j] > numbers1[j + 1]) {
                    num = numbers1[j];
                    numbers1[j] = numbers1[j + 1];
                    numbers1[j + 1] = num;
                }
            }
        }
        for (int i : numbers1) {
            System.out.print(i + " ");
        }
    }
}
