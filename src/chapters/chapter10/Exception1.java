package chapters.chapter10;

public class Exception1 {

    public static void main(String[] args) {

        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("Этo не будет выведено");
        } catch (ArithmeticException e) {
            System.out.println("деление на нуль");
        }
        System.out.println("после оператора catch");
    }
}
