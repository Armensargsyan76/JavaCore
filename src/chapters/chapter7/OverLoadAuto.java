package chapters.chapter7;

public class OverLoadAuto {
    void test() {
        System.out.println("parameter missing");
    }

    void test(int a, int b) {
        System.out.println("a, b :" + a + " " + b);
    }

    void test(double a) {
        System.out.println("double a:" + a);
    }
}
