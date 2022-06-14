package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);


        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();

        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("quantity = " + count);

        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count1++;
            }
        }
        System.out.println("quantity = " + count1);

        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        System.out.println(avg / array.length);

        double avg1 = 0;
        for (int i = 0; i < array.length; i++) {
            avg1 += array[i];
        }
        System.out.println(avg);


    }

}

