package chapters.chapter8;

public class DynamicTest {
    public static void main(String[] args) {
        ADynamic a = new ADynamic();
        BDynamic b = new BDynamic();
        CDynamic c = new CDynamic();
        ADynamic r;

        r = a;
        r.callMe();
        r = b;
        r.callMe();
        r = c;
        r.callMe();
    }
}
