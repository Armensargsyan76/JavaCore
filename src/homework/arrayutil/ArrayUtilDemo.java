package homework.arrayutil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30, -9};
        ArrayUtilMethod au = new ArrayUtilMethod();
        int max = au.max(array);
        System.out.println("max = " + max);
        int min = au.min(array);
        System.out.println("min = " + min);
        int count = au.countEven(array);
        System.out.println("county even = " + count);
        int count1 = au.countOdd(array);
        System.out.println("county odd = " + count1);
        au.printEven(array);
        System.out.println();
        au.printOdd(array);
        double average = au.average(array);
        System.out.println();
        System.out.println("average : " + average);
    }

}
