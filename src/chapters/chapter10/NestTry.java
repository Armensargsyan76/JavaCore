package chapters.chapter10;

public class NestTry {

    public static void main(String[] args) {

        try {
            int a = args.length;
            System.out.println("a : " + a);
            int b = 42 / a;
            try {
                if (a == 1) {
                    a = a / (a - a);
                }
                if (a == 2) {
                    int[] c = {5};
                    c[40] = 15;
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("индекс за пределами массива :" + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("деление на нуль : " + e);
        }


    }

    static void nest(int a) {
        try {
            if (a == 1) {
                a = a / (a - a);
            }
            if (a == 2) {
                int[] c = {1};
                c[40] = 15;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("индекс за пределами массива :" + e);
        }

    }

}

