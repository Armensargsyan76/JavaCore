package chapters.chapter7;

public class OverLoadAutoDemo {
    public static void main(String[] args) {
        int i = 88;
        OverLoadAuto ob = new OverLoadAuto();
        ob.test();
        ob.test(10, 20);
        ob.test(i);
        ob.test(123.23);
    }
}
