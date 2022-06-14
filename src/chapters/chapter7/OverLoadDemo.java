package chapters.chapter7;

public class OverLoadDemo {
    public static void main(String[] args) {
        OverLoad ob = new OverLoad();
        double result;
        ob.test();
        ob.test(8);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("result method ob.test(123.25) :" + result);

    }
}
