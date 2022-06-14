package chapters.chapter7;

public class OverLoad {
    void test() {
        System.out.println("parameter missing");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a, b : " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double : " + a);
        return a * a;
    }

}
