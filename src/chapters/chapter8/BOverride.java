package chapters.chapter8;

public class BOverride extends AOverride {
    int c;

    BOverride(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    void show() {
        System.out.println("c: " + c);
    }

    void show1() {
        super.show();
    }
}
