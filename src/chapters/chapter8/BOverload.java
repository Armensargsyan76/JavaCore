package chapters.chapter8;

public class BOverload extends AOverload {
    int c;

    BOverload(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    void show(String msg) {
        System.out.println(msg + " " + c);
    }
}
