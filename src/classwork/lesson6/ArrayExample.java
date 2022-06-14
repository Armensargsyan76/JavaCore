package classwork.lesson6;

public class ArrayExample {

    public static void main(String[] args) {


        int[] numbers = {87, 55, 21, -7, 0, };
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length-1]);
        System.out.println(numbers.length);




        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");


        }
        System.out.println();
        numbers[4] = 74;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }

    }

}
