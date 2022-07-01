package chapters.chapter10;

public class NestTryMeth {

    public static void main(String[] args) {

        int a = args.length;
        System.out.println("a :" + a);

        try {
            int b = 42 / a;
            NestTry.nest(a);
        } catch (ArithmeticException e) {
            System.out.println("деление на нуль :" + e);
        }
    }
}
