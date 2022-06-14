package homework.arrayutil;

public class ArrayUtilDemo {
    public static void main(String[] args) {

        ArraySortMethod sort = new ArraySortMethod();
        int[] number = {43, 55, 5, -9, 0, 12, 14, 65};
        sort.sortFromBigToSmall(number);
        System.out.println();
        sort.sortFromSmallToBig(number);
        System.out.println();
        ArrayUtilMethod au = new ArrayUtilMethod();
        au.printElements(number);
        System.out.println();
        System.out.println("max = " + au.bigElement(number));
        System.out.println("min = " + au.smallElement(number));
        au.pairElements(number);
        System.out.println();
        au.oddElements(number);
        System.out.println();
        int count = au.countPair(number);
        System.out.println("count = " + count);
        int countOdd = au.countOdd(number);
        System.out.println("countOdd = " + countOdd);
        System.out.println(au.average(number));

    }

}
