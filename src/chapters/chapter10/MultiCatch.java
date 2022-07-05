package chapters.chapter10;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] array = {1, 2, 3};
        try {
            int result = a / b;
            array[10] = 15;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Иcключeниe перехвачено " + e);
        }
        System.out.println("Пocлe многократного перехвата");
    }
}
