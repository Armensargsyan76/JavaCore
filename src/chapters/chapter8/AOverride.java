package chapters.chapter8;

public class AOverride {
    int i, j;

    AOverride(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j : " + i + " " + j);
    }
}
