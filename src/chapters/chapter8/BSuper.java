package chapters.chapter8;

public class BSuper extends ASuper {

    int i;

    BSuper(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("член i в суперклассе : " + super.i);
        System.out.println("член i в подклассе : " + i);
    }
}
