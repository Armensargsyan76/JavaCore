package chapters.chapter8;

public class AOverload {
    int i, j;

    AOverload(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j : " + i + " " + j);
    }
}
