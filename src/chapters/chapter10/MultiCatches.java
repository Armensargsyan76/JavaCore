package chapters.chapter10;

public class MultiCatches {

    public static void main(String[] args) {

        try {
            int a = args.length;
            System.out.println("a :" + a);
            int b = 42 / a;
            int[] c = {1};
            c[42] = 15;
        } catch (ArithmeticException e) {
            System.out.println("деление на нуль " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ошибка индексации за пределами массива " + e);
        }
    }
}
